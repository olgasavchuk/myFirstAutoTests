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

        String gender = new String();
        switch(title.toLowerCase()){
            case "sir":
            case "mr":
            case "master":
                gender = "M";
                break;
            case "miss":
            case "mrs":
            case "ms":
            case "lady":
            case "madam":
                gender = "F";
                break;
        }
        return gender;
    }

    @Test
    public void SwitchOnShortCode(){
        assertEquals("United Kingdom", ShortCode("Uk"));
        assertEquals("United States", ShortCode("uS"));
        assertEquals("United States", ShortCode("uSa"));
        assertEquals("France", ShortCode("FR"));
        assertEquals("Sweden", ShortCode("se"));
        assertEquals("Rest Of World", ShortCode("SA"));
        assertEquals("Rest Of World", ShortCode("eS"));
    }

    private String ShortCode(String code) {

        String country;
        switch (code.toLowerCase()){
            case "uk":
                country = "United Kingdom";
                break;
            case "us":
            case "usa":
                country = "United States";
                break;
            case "fr":
                country = "France";
                break;
            case "se":
                country = "Sweden";
                break;
            default:
                country = "Rest Of World";
                break;
        }
        return country;
    }

    @Test
    public void SwitchOnInt(){
        assertEquals("One", NumberCode(1));
        assertEquals("Two", NumberCode(2));
        assertEquals("Three", NumberCode(3));
        assertEquals("Four", NumberCode(4));
        assertEquals("Too small", NumberCode(-5));
        assertEquals("Too big", NumberCode(7));
    }

    private String NumberCode(int i) {

        switch (i) {
            case (1):
                return "One";
            case (2):
                return "Two";
            case (3):
                return "Three";
            case (4):
                return "Four";
            default:
                if (i < 1) {
                    return "Too small";
                }
                if (i > 4) {
                    return "Too big";
                }
        }
        return "";
    }
}
