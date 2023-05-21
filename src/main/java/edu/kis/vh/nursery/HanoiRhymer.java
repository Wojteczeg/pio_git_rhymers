package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Count in total
     * @param in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     *Get total amount of rejected count
     * @return totalRejected
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}
