package io.mathlark.larkv2.utils;

import io.mathlark.larkv2.LarkVM;
import io.mathlark.larkv2.expressions.IExpression;

public class LarkExecUtils {
    public static Object execute(String stmt) {
        IExpression expr = LarkVM.parse(stmt);
        return expr.val();
    }
}
