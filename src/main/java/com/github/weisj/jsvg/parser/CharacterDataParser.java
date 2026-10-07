package com.github.weisj.jsvg.parser;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/CharacterDataParser.class */
final class CharacterDataParser {
    private static final boolean DEBUG = false;
    private State state = State.SEGMENT_START;
    private StringBuilder buffer = new StringBuilder();
    private char[] data;
    private int begin;
    private int end;

    CharacterDataParser() {
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/parser/CharacterDataParser$State.class */
    private enum State {
        SEGMENT_START(false),
        SEGMENT_BREAK(true),
        WHITESPACE_AFTER_CHAR(true),
        WHITESPACE_AFTER_SEGMENT_BREAK(true),
        CHARACTER(false);

        private final boolean isVisualSpace;

        State(boolean isVisualSpace) {
            this.isVisualSpace = isVisualSpace;
        }
    }

    public void append(char[] ch, int offset, int length) {
        if (length == 0) {
            return;
        }
        this.data = ch;
        this.begin = offset;
        this.end = offset + length;
        if (isSegmentBreak(this.data[this.begin])) {
            int segmentBreaks = trimLeadingWhiteSpace();
            if (this.state == State.SEGMENT_BREAK) {
                segmentBreaks++;
            }
            if (this.begin > offset && segmentBreaks > 1) {
                this.begin--;
                this.data[this.begin] = ' ';
                if (this.state == State.CHARACTER || this.state == State.SEGMENT_BREAK) {
                    this.state = State.WHITESPACE_AFTER_CHAR;
                }
            }
        }
        int segmentBreaks2 = trimTrailingWhiteSpace();
        if (this.end < offset + length) {
            this.data[this.end] = segmentBreaks2 > 0 ? '\n' : ' ';
            this.end++;
        }
        if (this.begin >= this.end) {
            return;
        }
        this.buffer.ensureCapacity((this.buffer.length() + this.end) - this.begin);
        appendData();
    }

    private void appendData() {
        int initialOffset = this.begin;
        while (this.begin < this.end) {
            char c = this.data[this.begin];
            boolean segmentBreak = isSegmentBreak(c);
            boolean whiteSpace = isWhitespace(c);
            if (!segmentBreak && !whiteSpace) {
                if (this.state == State.WHITESPACE_AFTER_CHAR || (this.state.isVisualSpace && this.begin > initialOffset)) {
                    this.buffer.append(' ');
                }
                this.state = State.CHARACTER;
                this.buffer.append(c);
            } else if (whiteSpace) {
                switch (this.state) {
                    case CHARACTER:
                    case WHITESPACE_AFTER_CHAR:
                        this.state = State.WHITESPACE_AFTER_CHAR;
                        break;
                    case SEGMENT_BREAK:
                    case WHITESPACE_AFTER_SEGMENT_BREAK:
                        this.state = State.WHITESPACE_AFTER_SEGMENT_BREAK;
                        break;
                }
            } else {
                this.state = State.SEGMENT_BREAK;
            }
            this.begin++;
        }
    }

    public boolean canFlush(boolean dueToSegmentBreak) {
        if (this.state == State.SEGMENT_START) {
            return false;
        }
        return dueToSegmentBreak || this.buffer.length() > 0;
    }

    public char[] flush(boolean dueToSegmentBreak) {
        if (dueToSegmentBreak && this.state != State.CHARACTER) {
            this.buffer.append(' ');
        }
        if (dueToSegmentBreak) {
            this.state = State.SEGMENT_BREAK;
        }
        char[] ch = new char[this.buffer.length()];
        this.buffer.getChars(0, ch.length, ch, 0);
        this.buffer = new StringBuilder();
        return ch;
    }

    private int trimLeadingWhiteSpace() {
        int segmentBreakCount = 0;
        while (this.begin < this.end) {
            if (isSegmentBreak(this.data[this.begin])) {
                segmentBreakCount++;
                this.begin++;
            } else {
                if (!isWhitespace(this.data[this.begin])) {
                    break;
                }
                this.begin++;
            }
        }
        return segmentBreakCount;
    }

    private int trimTrailingWhiteSpace() {
        int segmentBreakCount = 0;
        while (this.begin < this.end) {
            if (isSegmentBreak(this.data[this.end - 1])) {
                segmentBreakCount++;
                this.end--;
            } else {
                if (!isWhitespace(this.data[this.end - 1])) {
                    break;
                }
                this.end--;
            }
        }
        return segmentBreakCount;
    }

    private static boolean isSegmentBreak(char c) {
        return c == '\n' || c == '\r';
    }

    private static boolean isWhitespace(char c) {
        return c == ' ' || c == '\t';
    }
}
