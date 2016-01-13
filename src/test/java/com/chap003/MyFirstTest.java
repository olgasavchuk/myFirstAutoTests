package com.chap003;

import org.junit.Test;
import static org.junit.Assert.*;


public class MyFirstTest {

    @Test
    public void checkTwoPlusTwo (){

        int answer = 2 + 2;
        assertEquals("2 + 2 = 4", 4, answer);

    }

    @Test
    public void checkTwoMinusTwo(){

        int answer = 2 - 2;
        assertEquals("2 - 2 = 0", 0, answer);
    }

    @Test
    public void checkFourDivideTwo(){

        int answer = 4 / 2;
        assertEquals("4 / 2 = 2", 2, answer);
    }

    @Test
    public void checkTwoMultipleTwo(){

        int answer = 2 * 2;
        assertEquals("2 * 2", 4, answer);
    }

}
