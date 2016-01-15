package com.chap004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {

    @Test
    public void integerExploration() {

        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns 5", 5, five.intValue());
    }

    @Test
    public void autoboxingChecking() {

        Integer six = 6;
        assertEquals("autoboxing 6", 6, six.intValue());
        }

    @Test
    public void convertIntToHex(){

        int test = 11;
        assertEquals("11 equals to b", "b", Integer.toHexString(test));
        assertEquals("10 equals to a","a", Integer.toHexString(10) );
        assertEquals("21 equals to 15","15", Integer.toHexString(21) );
        assertEquals("3 equals to 3","3", Integer.toHexString(3) );
    }

    @Test
    public void validateMaxMinIntegerValues(){

        assertEquals("Max value is 2147483647", 2147483647, Integer.MAX_VALUE);
        assertEquals("Min value is -2147483648", -2147483648, Integer.MIN_VALUE);
    }
}
