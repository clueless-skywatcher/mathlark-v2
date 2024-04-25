package io.mathlark.larkv2.numbers;

public class NumericUtils {
    public static double clipValue(double value, double lower, double upper) {
        if (value < lower) return lower;
        if (value > upper) return upper;
        return value;
    }

    public static int clipValue(int value, int lower, int upper) {
        if (value < lower) return lower;
        if (value > upper) return upper;
        return value;
    }

    public static long clipValue(long value, long lower, long upper) {
        if (value < lower) return lower;
        if (value > upper) return upper;
        return value;
    }

    public static boolean checkInRange(double value, double lower, double upper) {
        return lower <= value && value <= upper;
    }

    public static long powerLong(long base, long exp) {
        long result = 1;
        long square = base;

        while (exp > 0) {
            if (exp % 2 != 0) {
                result *= square;
            }
            square *= square;
            exp /= 2;
        }

        return result;
    }

}
