package com.chap007;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTest {

    @Test
    public void someStringMethod() {
        String aString = "abcdef";
        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDef")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
        //string indexing starts at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}
