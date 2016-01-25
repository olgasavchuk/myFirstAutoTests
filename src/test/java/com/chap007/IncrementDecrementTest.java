package com.chap007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncrementDecrementTest {

    @Test
    public void incrementDecrementOperatorsExplored() {

        int num = 10;

        // num is 11 at the same time with assertEquals function
        assertEquals(11, ++num);
        assertEquals(10, --num);

        // num is 10, and only after assertEquals function it becomes 11
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
        assertEquals(9, --num);
        assertEquals(8, --num);
        assertEquals(8, num);
    }
}
