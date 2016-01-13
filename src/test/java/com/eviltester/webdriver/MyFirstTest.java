package com.eviltester.webdriver;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void checkTwoPlusTwo (){

        int answer = 2 + 2;
        assertEquals("2 + 2 = 4", 4, answer);

    }



}
