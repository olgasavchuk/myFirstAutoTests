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



}
