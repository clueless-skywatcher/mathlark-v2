package io.mathlark.larkv2.numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class IntRationalTest {
    @Test
    public void testRationals() {
        assertEquals(new IntRational(1, 2).toString(), "(1/2)");
        assertEquals(new IntRational(2, 1).toString(), "2");
        assertEquals(new IntRational(0, 25).toString(), "0");
        assertEquals(IntRational.make(-2, 6).toString(), "(-1/3)");
        assertEquals(IntRational.make(50, 2).toString(), "25");
        assertEquals(IntRational.make(45, 25).toString(), "(9/5)");
    }

    @Test
    public void testAdd() {
        assertEquals(IntRational.make(1, 2).add(IntRational.make(1, 2)).toString(), "1");
        assertEquals(IntRational.make(1, 2).add(IntRational.make(1, 3)).toString(), "(5/6)");
        assertEquals(IntRational.make(1, 5).add(IntRational.make(2, 6)).toString(), "(8/15)");
        assertEquals(IntRational.make(1, 5).add(15).toString(), "(76/5)");
    }

    @Test
    public void testSub() {
        assertEquals(IntRational.make(15, 1).sub(IntRational.make(1, 5)).toString(), "(74/5)");
        assertEquals(IntRational.make(1, 2).sub(IntRational.make(1, 2)).toString(), "0");
        assertEquals(IntRational.make(1, 3).sub(IntRational.make(1, 2)).toString(), "(-1/6)");
    }

    @Test
    public void testMul() {
        assertEquals(IntRational.make(1, 2).mul(IntRational.make(1, 2)).toString(), "(1/4)");
        assertEquals(IntRational.make(1, 2).mul(IntRational.make(1, 3)).toString(), "(1/6)");
        assertEquals(IntRational.make(1, 2).mul(0).toString(), "0");
        assertEquals(IntRational.make(1, 3).mul(IntRational.make(1, -2)).toString(), "(-1/6)");
        assertEquals(IntRational.make(1, 5).mul(IntRational.make(5, 6)).toString(), "(1/6)");
    }

    @Test
    public void testDiv() {
        assertEquals(IntRational.make(1, 2).div(IntRational.make(1, 2)).toString(), "1");
        assertEquals(IntRational.make(1, 2).div(IntRational.make(3, 2)).toString(), "(1/3)");
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                IntRational.make(1, 2).div(0);
            }
        });
        assertEquals(IntRational.make(1, 3).div(IntRational.make(1, -2)).toString(), "(-2/3)");
        assertEquals(IntRational.make(1, 5).div(IntRational.make(5, 6)).toString(), "(6/25)");
    }

    @Test
    public void testPow() {
        assertEquals(IntRational.make(1, 2).pow(2), IntRational.make(1, 2).mul(IntRational.make(1, 2)));
        assertEquals(IntRational.make(42, 68).pow(3), IntRational.make(74088, 314432));
        assertEquals(IntRational.make(42, 68).pow(-3), IntRational.make(74088, 314432).reciprocal());
    }

    @Test
    public void testNumericValue() {
        assertEquals(IntRational.make(1, 2).numericValue(), 0.5);
    }
}
