package com.demoblaze.tests;

import com.demoblaze.pages.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests extends BaseTest{


    @Test(priority = 0)
    public void verifyHomePageLoads(){
        soft.assertTrue(homePage.isNavBarDisplayed(),
                "Navigation bar is not displayed");
        soft.assertTrue(homePage.isProductStoreHeadingDisplayed(),
                "Product store heading is not displayed");
    }

    @Test(priority = 1)
    public void verifyCategoriesLoad(){
        soft.assertTrue(homePage.isPhonesCategoryDisplayed(),
                "phones category is not displayed");
        soft.assertTrue(homePage.isLaptopsCategoryDisplayed(),
                "laptops category is not displayed");
        soft.assertTrue(homePage.isMonitorsCategoryDisplayed(),
                "monitors category is not displayed");
    }

    @Test(priority = 2)
    public void verifyClickingOnAllCategories(){
        //phones category
        homePage.clickOnPhonesCategory();
        soft.assertFalse(homePage.isLaptopProductDisplayed(),
                "There is a laptop product in the phones category");
        //laptops category
        homePage.clickOnLaptopsCategory();
        soft.assertFalse(homePage.isPhoneProductDisplayed(),
                "There is a phone product in the Laptops category");
        //monitors category
        homePage.clickOnMonitorsCategory();
        soft.assertFalse(homePage.isPhoneProductDisplayed(),
                "There is a phone product in the Monitors category");
    }

//    @Test(priority = 3)
//    public void verifyClickingNextAndPrevious() throws InterruptedException {
//        HomePage homePage = new HomePage();
//        soft.assertTrue(homePage.isPhoneProductDisplayed());
//        homePage.clickNextBtn();
//        homePage.isMonitorProductDisplayed();
////        soft.assertTrue(homePage.isMonitorProductDisplayed(),
////                "We are not in the next page");
//
//    }



}
