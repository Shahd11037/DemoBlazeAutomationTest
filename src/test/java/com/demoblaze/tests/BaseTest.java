package com.demoblaze.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    private static final String URL = "https://www.demoblaze.com/";
    protected SoftAssert soft;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        soft = new SoftAssert();

    }

    @AfterClass
    public void tearDown(){
        soft.assertAll();
        driver.quit();
    }
}
