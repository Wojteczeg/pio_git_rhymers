package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public  int HEAP_MAX_SIZE = 12;
    private final int HEAP_EMPTY = -1;
    public  int DEFAULT = -1;
    final private int[] numbers = new int[HEAP_MAX_SIZE];

    private int total = DEFAULT;
    
     public int getTotal() {
        return total;
    }

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
            return HEAP_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return HEAP_EMPTY;
        return numbers[total--];
    }

    public int[] getNumbers() {
         return numbers;
    }
}
