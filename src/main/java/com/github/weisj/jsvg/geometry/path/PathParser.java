package com.github.weisj.jsvg.geometry.path;

import com.github.weisj.jsvg.util.ParserBase;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:com/github/weisj/jsvg/geometry/path/PathParser.class */
public final class PathParser extends ParserBase {
    private char currentCommand;

    public PathParser(@NotNull String input) {
        super(input, 0);
    }

    private boolean isCommandChar(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    @Override // com.github.weisj.jsvg.util.ParserBase
    public float nextFloat() throws NumberFormatException {
        float f = super.nextFloat();
        consumeWhiteSpaceOrSeparator();
        return f;
    }

    private boolean nextFlag() {
        char c = peek();
        consume();
        consumeWhiteSpaceOrSeparator();
        if (c == '1') {
            return true;
        }
        if (c == '0') {
            return false;
        }
        throw new IllegalStateException("Invalid flag value '" + c + "' " + currentLocation());
    }

    @NotNull
    public BezierPathCommand parseMeshCommand() {
        char peekChar = peek();
        this.currentCommand = 'z';
        if (isCommandChar(peekChar)) {
            consume();
            this.currentCommand = peekChar;
        }
        consumeWhiteSpaceOrSeparator();
        switch (this.currentCommand) {
            case 'C':
                return new CubicBezierCommand(false, nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloatOrUnspecified(), nextFloatOrUnspecified());
            case 'L':
                return new LineToBezier(false, nextFloatOrUnspecified(), nextFloatOrUnspecified());
            case 'c':
                return new CubicBezierCommand(true, nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloatOrUnspecified(), nextFloatOrUnspecified());
            case 'l':
                return new LineToBezier(true, nextFloatOrUnspecified(), nextFloatOrUnspecified());
            default:
                throw new IllegalStateException("Only commands c C l L allowed");
        }
    }

    public PathCommand[] parsePathCommand() {
        PathCommand cmd;
        if ("none".equals(this.input)) {
            return new PathCommand[0];
        }
        List<PathCommand> commands = new ArrayList<>();
        this.currentCommand = 'Z';
        while (hasNext()) {
            char peekChar = peek();
            if (isCommandChar(peekChar)) {
                consume();
                this.currentCommand = peekChar;
            }
            consumeWhiteSpaceOrSeparator();
            switch (this.currentCommand) {
                case 'A':
                    cmd = new Arc(false, nextFloat(), nextFloat(), nextFloat(), nextFlag(), nextFlag(), nextFloat(), nextFloat());
                    break;
                case 'B':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'I':
                case 'J':
                case 'K':
                case 'N':
                case 'O':
                case 'P':
                case 'R':
                case 'U':
                case 'W':
                case 'X':
                case 'Y':
                case AbstractJsonLexerKt.BEGIN_LIST /* 91 */:
                case AbstractJsonLexerKt.STRING_ESC /* 92 */:
                case AbstractJsonLexerKt.END_LIST /* 93 */:
                case '^':
                case '_':
                case '`':
                case 'b':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'i':
                case 'j':
                case 'k':
                case 'n':
                case 'o':
                case 'p':
                case 'r':
                case AbstractJsonLexerKt.UNICODE_ESC /* 117 */:
                case 'w':
                case 'x':
                case 'y':
                default:
                    throw new IllegalArgumentException("Invalid path element " + this.currentCommand + currentLocation());
                case 'C':
                    cmd = new Cubic(false, nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat());
                    break;
                case 'H':
                    cmd = new Horizontal(false, nextFloat());
                    break;
                case 'L':
                    cmd = new LineTo(false, nextFloat(), nextFloat());
                    break;
                case 'M':
                    cmd = new MoveTo(false, nextFloat(), nextFloat());
                    this.currentCommand = 'L';
                    break;
                case 'Q':
                    cmd = new Quadratic(false, nextFloat(), nextFloat(), nextFloat(), nextFloat());
                    break;
                case 'S':
                    cmd = new CubicSmooth(false, nextFloat(), nextFloat(), nextFloat(), nextFloat());
                    break;
                case 'T':
                    cmd = new QuadraticSmooth(false, nextFloat(), nextFloat());
                    break;
                case 'V':
                    cmd = new Vertical(false, nextFloat());
                    break;
                case 'Z':
                case 'z':
                    cmd = new Terminal();
                    break;
                case 'a':
                    cmd = new Arc(true, nextFloat(), nextFloat(), nextFloat(), nextFlag(), nextFlag(), nextFloat(), nextFloat());
                    break;
                case 'c':
                    cmd = new Cubic(true, nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat());
                    break;
                case 'h':
                    cmd = new Horizontal(true, nextFloat());
                    break;
                case 'l':
                    cmd = new LineTo(true, nextFloat(), nextFloat());
                    break;
                case 'm':
                    cmd = new MoveTo(true, nextFloat(), nextFloat());
                    this.currentCommand = 'l';
                    break;
                case 'q':
                    cmd = new Quadratic(true, nextFloat(), nextFloat(), nextFloat(), nextFloat());
                    break;
                case 's':
                    cmd = new CubicSmooth(true, nextFloat(), nextFloat(), nextFloat(), nextFloat());
                    break;
                case 't':
                    cmd = new QuadraticSmooth(true, nextFloat(), nextFloat());
                    break;
                case 'v':
                    cmd = new Vertical(true, nextFloat());
                    break;
            }
            commands.add(cmd);
        }
        return (PathCommand[]) commands.toArray(new PathCommand[0]);
    }
}
