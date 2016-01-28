package com.chap008;

import org.junit.Test;

import static org.junit.Assert.*;

public class TernaryOperatorTest {

    @Test
    public void ternaryOperator() {

        int numberOfCats = 1;
        assertEquals("there is onlt one cat", "cat", (numberOfCats==1)?"cat":"cats");
    }

    @Test
    public void catOrCatsHere(){

        assertEquals("how many cats: ", "cat", catOrCats(1));
    }

    private String catOrCats(int numberOfCats) {
        return (numberOfCats==1)?"cat":"cats";
    }
}
