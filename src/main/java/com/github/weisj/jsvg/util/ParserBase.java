package com.github.weisj.jsvg.util;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/ParserBase.class */
public class ParserBase {

    @NotNull
    protected final String input;
    private final int inputLength;
    private int index;

    public ParserBase(@NotNull String input, int startIndex) {
        this.input = input;
        this.inputLength = input.length();
        this.index = startIndex;
    }

    protected char peek() {
        return this.input.charAt(this.index);
    }

    protected void consume() {
        this.index++;
    }

    public boolean hasNext() {
        return this.index < this.inputLength;
    }

    public void consumeWhiteSpaceOrSeparator() {
        while (hasNext() && isWhiteSpaceOrSeparator(peek())) {
            consume();
        }
    }

    private boolean isWhiteSpaceOrSeparator(char c) {
        return c == ',' || Character.isWhitespace(c);
    }

    private String nextNumberString() {
        int start = this.index;
        NumberCharState state = new NumberCharState();
        while (hasNext() && isValidNumberChar(peek(), state)) {
            consume();
        }
        int end = this.index;
        return this.input.substring(start, end);
    }

    protected float nextFloatOrUnspecified() {
        if (hasNext()) {
            return nextFloat();
        }
        return Float.NaN;
    }

    public float nextFloat() throws NumberFormatException {
        int start = this.index;
        String token = nextNumberString();
        try {
            return Float.parseFloat(token);
        } catch (NumberFormatException e) {
            String msg = "Unexpected token '" + token + "' rest=" + this.input.substring(start, Math.min(this.input.length(), start + 10)) + currentLocation();
            throw new IllegalStateException(msg, e);
        }
    }

    public double nextDouble() throws NumberFormatException {
        int start = this.index;
        String token = nextNumberString();
        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            String msg = "Unexpected token '" + token + "' rest=" + this.input.substring(start, Math.min(this.input.length(), start + 10)) + currentLocation();
            throw new IllegalStateException(msg, e);
        }
    }

    @NotNull
    protected String currentLocation() {
        return "(index=" + this.index + " in input=" + this.input + ")";
    }

    private boolean isValidNumberChar(char c, NumberCharState state) {
        boolean valid = '0' <= c && c <= '9';
        if (valid && state.iteration == 1 && this.input.charAt(this.index - 1) == '0') {
            return false;
        }
        state.signAllowed = state.signAllowed && !valid;
        if (state.dotAllowed && !valid) {
            valid = c == '.';
            state.dotAllowed = !valid;
        }
        if (state.signAllowed && !valid) {
            valid = c == '+' || c == '-';
            state.signAllowed = valid;
        }
        if (state.exponentAllowed && !valid) {
            valid = c == 'e' || c == 'E';
            state.exponentAllowed = !valid;
            state.signAllowed = valid;
            state.dotAllowed = !valid;
        }
        state.iteration++;
        return valid;
    }

    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/util/ParserBase$NumberCharState.class */
    private static final class NumberCharState {
        int iteration;
        boolean dotAllowed;
        boolean signAllowed;
        boolean exponentAllowed;

        private NumberCharState() {
            this.iteration = 0;
            this.dotAllowed = true;
            this.signAllowed = true;
            this.exponentAllowed = true;
        }
    }
}
