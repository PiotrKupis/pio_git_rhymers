package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MINUSONE = -1;
    public static final int TWELVE = 12;
    private int[] numbers = new int[TWELVE];

    public int total = MINUSONE;

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUSONE;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int getTotal() {
        return total;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUSONE;
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUSONE;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
