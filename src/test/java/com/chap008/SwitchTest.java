package com.chap008;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchTest {

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    private String likelyGenderIs(String title) {
        String likelyGender = new String();
        title = title.toLowerCase();

        switch(title){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            case "miss":
                likelyGender = "F";
                break;
            case "mrs":
                likelyGender = "F";
                break;
            case "ms":
                likelyGender = "F";
                break;
            case "lady":
                likelyGender = "F";
                break;
            case "madam":
                likelyGender = "F";
                break;

        }
        return likelyGender;
    }

}
