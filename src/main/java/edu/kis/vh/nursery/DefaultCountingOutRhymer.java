package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public  int HEAP_MAX_SIZE = 12;
    public  int DEFAULT = -1;
    final private int[] numbers = new int[HEAP_MAX_SIZE];

    public int total = DEFAULT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT;
    }

    public boolean isFull() {
        return total == HEAP_MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}
