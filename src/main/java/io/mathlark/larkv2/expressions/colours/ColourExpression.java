package io.mathlark.larkv2.expressions.colours;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.StringExpression;
import io.mathlark.larkv2.expressions.math.NumericExpression;
import io.mathlark.larkv2.symbols.GlobalSymbols;
import lombok.Getter;

public class ColourExpression implements IExpression {
    private @Getter Long r;
    private @Getter Long g;
    private @Getter Long b;

    public ColourExpression(long r, long g, long b) {
        if (r > 255) r = 255;
        if (r < 0) r = 0;

        if (g > 255) g = 255;
        if (g < 0) g = 0;

        if (b > 255) b = 255;
        if (b < 0) b = 0;

        this.r = r;
        this.g = g;
        this.b = b;
    }

    public ColourExpression(NumericExpression r, NumericExpression g, NumericExpression b) {
        this(r.value.longValue(), g.value.longValue(), b.value.longValue());
    }

    @Override
    public IExpression evaluate() {
        return this;
    }

    @Override
    public String inputForm() {
        return String.format("Colour(%s, %s, %s)", r.toString(), g.toString(), b.toString());
    }

    @Override
    public IExpression add(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression sub(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mul(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression negate() {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression pow(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression div(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public IExpression mod(IExpression other) {
        return GlobalSymbols.UNDEFINED;
    }

    @Override
    public StringExpression head() {
        return new StringExpression("Colour");
    }

    @Override
    public Object val() {
        return toString();
    }

    public String toString() {
        String COLOUR_FORMAT = "\033[38;2;%d;%d;%dm\u25A0\033[0m";
        return String.format(COLOUR_FORMAT, r.intValue(), g.intValue(), b.intValue());
    }

    @Override
    public IExpression length() {
        return new NumericExpression(0);
    }
}
