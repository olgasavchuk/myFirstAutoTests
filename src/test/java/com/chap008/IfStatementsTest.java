package com.chap008;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfStatementsTest {

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";

        if (!url.startsWith("http")){
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void assertTruthy(){
        boolean truthy = true;
        if (truthy) assertTrue(truthy);
    }

    @Test
    public void assertTruthyAndFalsy(){
        boolean truthy = true;

        if (truthy) assertTrue(truthy);
        if (!truthy) assertFalse(truthy);
    }

    @Test
    public void callNestedIfElseHorror(){
        nestedIfElseHorror(true, false);
        nestedIfElseHorror(true, true);
        nestedIfElseHorror(false, false);
        nestedIfElseHorror(false, true);

    }

    public void nestedIfElseHorror(boolean aFirst, boolean aSecond){
        boolean truthy = aFirst;
        boolean falsey = aSecond;

        if (truthy){
            if (!falsey){
                if ((truthy)&&(!falsey)){
                    if (falsey||truthy){
                        System.out.println("T | F");
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }else{
                System.out.println("T | T");
                assertTrue(truthy);
                assertTrue(falsey);
            }
        }else{
            if(!truthy){
                if(falsey){
                    System.out.println("F | T");
                    assertTrue(falsey);
                    assertFalse(truthy);
                }else{
                    System.out.println("F | F");
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }



}
