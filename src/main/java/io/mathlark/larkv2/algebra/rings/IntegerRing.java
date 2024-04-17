package io.mathlark.larkv2.algebra.rings;

public class IntegerRing implements IRing<Long> {

    @Override
    public Long add(Long a1, Long a2) {
        return a1 + a2;
    }

    @Override
    public Long mul(Long a1, Long a2) {
        return a1 * a2;
    }

    @Override
    public Long pow(Long base, Long exp) {
        long result = 1;
        long square = base;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result *= square;
            }
            square = square * square;
            exp /= 2;
        }

        return result;
    }

    @Override
    public Long getZero() {
        return 0L;
    }

    @Override
    public Long getOne() {
        return 1L;
    }

    @Override
    public Long getInverse(Long a) {
        return -a;
    }

    @Override
    public boolean isMemberOf(Object a) {
        return a instanceof Long;
    }
    
}
