package com.demoblaze.tests;

import com.demoblaze.pages.BasePage;
import com.demoblaze.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static utilities.utility.setUtilityDriver;

public class BaseTest {

    protected WebDriver driver;
    private static final String URL = "https://www.demoblaze.com/index.html";
    protected SoftAssert soft;
    protected BasePage basePage;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        soft = new SoftAssert();
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();

    }

    @AfterClass
    public void tearDown(){
        soft.assertAll();
        driver.quit();
    }
}
