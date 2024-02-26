package io.mathlark.larkv2.colors;

import java.util.Map;

import io.mathlark.larkv2.expressions.IExpression;
import io.mathlark.larkv2.expressions.colors.ColorExpression;

import java.util.HashMap;

public class ColorsConstants {
    public static final Map<String, IExpression> COLOR_MAP = new HashMap<>();

    static {
        COLOR_MAP.put("Black", new ColorExpression(0, 0, 0));
        COLOR_MAP.put("White", new ColorExpression(255, 255, 255));
        COLOR_MAP.put("Red", new ColorExpression(255, 0, 0));
        COLOR_MAP.put("Lime", new ColorExpression(0, 255, 0));
        COLOR_MAP.put("Blue", new ColorExpression(0, 0, 255));
        COLOR_MAP.put("Yellow", new ColorExpression(255, 255, 0));
        COLOR_MAP.put("Cyan", new ColorExpression(0, 255, 255));
        COLOR_MAP.put("Green", new ColorExpression(0, 128, 0));
        COLOR_MAP.put("Fuchsia", new ColorExpression(255, 0, 255));
        COLOR_MAP.put("Silver", new ColorExpression(192, 192, 192));
        COLOR_MAP.put("Gray", new ColorExpression(128, 128, 128));
        COLOR_MAP.put("Maroon", new ColorExpression(128, 0, 0));
        COLOR_MAP.put("Olive", new ColorExpression(128, 128, 0));
        COLOR_MAP.put("Purple", new ColorExpression(128, 0, 128));
        COLOR_MAP.put("Navy", new ColorExpression(0, 0, 128));
    }
}
