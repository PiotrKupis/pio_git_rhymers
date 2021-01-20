package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int testValue = 4;
        rhymer.countIn(testValue);

        final int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testHanoiCountIn() {
        DefaultCountingOutRhymer hanoiRhymer = new HanoiRhymer();

        hanoiRhymer.countIn(10);
        Assert.assertEquals(0, hanoiRhymer.getTotal());
        Assert.assertEquals(false, hanoiRhymer.isFull());
    }

    @Test
    public void testFIFOCountOut() {
        DefaultCountingOutRhymer fifoRhymer = new FIFORhymer();

        Assert.assertEquals(-1, fifoRhymer.countOut());

        fifoRhymer.countIn(10);
        Assert.assertEquals(10, fifoRhymer.countOut());
    }

    @Test
    public void testInitLinkedList() {

        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(true, intLinkedList.isEmpty());

        for (int i = 0; i < 10; ++i)
            intLinkedList.push(i);

        Assert.assertEquals(false, intLinkedList.isEmpty());

        for (int i = 9; i >= 0; --i)
            Assert.assertEquals(i, intLinkedList.pop());

        Assert.assertEquals(false, intLinkedList.isFull());
        Assert.assertEquals(true, intLinkedList.isEmpty());
    }
}
