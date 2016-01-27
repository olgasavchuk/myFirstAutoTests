package com.chap007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BooleanTest {

    @Test
    public void booleanOperatorsExplored() {
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4);
        assertTrue(6 >= 6);
        assertTrue(7 >= 6);
        assertTrue(8 <= 8);
        assertTrue(8 <= 9);
        assertTrue(!false);
        boolean truthy = true;
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperatorsExplored() {
        assertTrue(true && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(false || false);
        assertFalse(false && true);
    }

    @Test
    public void ternaryOperatorExplored() {
        int x;
        x = 4 > 3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue(5 >= 4 ? true : false);
    }

    @Test
    public void bitwiseOperatorExplored() {
        assertEquals(0b0001, 0b1001 & 0b0101);
        assertEquals(0b1101, 0b1001 | 0b0101);
        assertEquals(0b1100, 0b1001 ^ 0b0101);
        int x = 0b0001;
        assertEquals("11111111111111111111111111111110", Integer.toBinaryString(~x));

    }

    @Test
    public void bitwiseAssignmentOperatorExplored() {
        byte x = 0b0001;

        x &= 0b1011; // x = 0b0001 & 0b1011
        assertEquals(0b0001, x);

        x |= 0b1001;
        assertEquals(0b1001, x);

        x ^= 0b1110;
        assertEquals(0b0111, x);
    }

    @Test
    public void bitwiseShiftOperatorsExplored() {
        int x = 56;

        assertEquals(x * 2, x << 1);
        assertEquals(x * 4, x << 2);
        assertEquals(x * 8, x << 3);

        x <<= 3;
        assertEquals(56 * 8, x);

        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE / 2, x >> 1);

        x = Integer.MIN_VALUE; //-ve
        assertEquals((Integer.MAX_VALUE / 2) + 1, x >>> 1);
    }

    @Test
    public void operatorPrecedence(){
        assertEquals(8, 4+2*6/3);
        assertEquals(12, (((4+2)*6)/3));
    }
}