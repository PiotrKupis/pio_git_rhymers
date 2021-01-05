package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//kombinacja alt + ←, sprawia że przenosimy się do zakładki pliku po lewo
//natomiat kombinacja alt + → sprawia że przenosimy się do zakładki pliku po prawo
