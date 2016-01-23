package com.chap007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void traditionalOperatorsExplored() {
        assertEquals(4, 2 + 2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F*2F,0);
        assertEquals(30.2D, 120.8D/4D,0);
        assertEquals("asdf", "as"+"df");
        assertEquals(1, 9%2);
    }
}
