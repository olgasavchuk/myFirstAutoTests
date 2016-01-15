package com.chap004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {

    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals("intValue returns 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns 5", 5, five.intValue());

    }

}
