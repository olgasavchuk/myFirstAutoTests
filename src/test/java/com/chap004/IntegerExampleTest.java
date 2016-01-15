package com.chap004;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExampleTest {

    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals("intValue returs 4", 4, four.intValue());
    }

}
