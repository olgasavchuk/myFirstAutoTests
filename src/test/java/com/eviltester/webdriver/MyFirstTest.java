package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    @Test
    public void startWebeDriver(){

        System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://google.com");
        Assert.assertTrue("title should start with Google", driver.getTitle().startsWith("Google"));

        driver.close();
        driver.quit();
    }


}
