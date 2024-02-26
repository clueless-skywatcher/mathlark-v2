package io.mathlark.larkv2.colours;

import java.util.Map;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.colours.ColourExpression;

import java.util.HashMap;

public class ColoursConstants {
    public static final Map<String, IExpression> COLOUR_MAP = new HashMap<>();

    static {
        COLOUR_MAP.put("Black", new ColourExpression(0, 0, 0));
        COLOUR_MAP.put("White", new ColourExpression(255, 255, 255));
        COLOUR_MAP.put("Red", new ColourExpression(255, 0, 0));
        COLOUR_MAP.put("Lime", new ColourExpression(0, 255, 0));
        COLOUR_MAP.put("Blue", new ColourExpression(0, 0, 255));
        COLOUR_MAP.put("Yellow", new ColourExpression(255, 255, 0));
        COLOUR_MAP.put("Cyan", new ColourExpression(0, 255, 255));
        COLOUR_MAP.put("Green", new ColourExpression(0, 128, 0));
        COLOUR_MAP.put("Fuchsia", new ColourExpression(255, 0, 255));
        COLOUR_MAP.put("Silver", new ColourExpression(192, 192, 192));
        COLOUR_MAP.put("Gray", new ColourExpression(128, 128, 128));
        COLOUR_MAP.put("Maroon", new ColourExpression(128, 0, 0));
        COLOUR_MAP.put("Olive", new ColourExpression(128, 128, 0));
        COLOUR_MAP.put("Purple", new ColourExpression(128, 0, 128));
        COLOUR_MAP.put("Navy", new ColourExpression(0, 0, 128));
    }
}
