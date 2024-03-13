package io.mathlark.larkv2.general;

public class BooleanArraysUtils {
    public static int getNextFalse(boolean[] arr, int start) {
        int i = 0;
        while (i < arr.length) {
            if (!arr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
