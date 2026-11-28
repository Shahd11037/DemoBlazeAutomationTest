package com.demoblaze.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class SignUpPage extends BasePage {

        private By signUpLinkLocator = By.xpath("//a[@id='signin2']");
        private By usernameFieldLocator = By.xpath("//input[@id='sign-username']");
        private By passwordFieldLocator = By.xpath("//input[@id='sign-password']");
        private By signUpButtonLocator = By.xpath("//button[@onclick='register()']");

        public SignUpPage(WebDriver driver) {
            super(driver);
        }

        //to help assert if the sign up form is visible
        public boolean isUsernameFieldDisplayed() {
            return isElementDisplayed(usernameFieldLocator);
        }

        public boolean isPasswordFieldDisplayed() {
            return isElementDisplayed(passwordFieldLocator);
        }

        //clicking on Sign up link in the navbar
        public void clickOnSignUpLink() {
            myClick(signUpLinkLocator);
        }

        //typing the username
        public void enterUsername(String username) {
            mySendKeys(usernameFieldLocator, username);
        }


        //typing the password
        public void enterPassword(String password) {
            mySendKeys(passwordFieldLocator, password);
        }

        //clicking on Sign up button inside the form
        public void clickOnSignUpButton() {
            myClick(signUpButtonLocator);
        }

        //full sign up steps
        public void signUp(String username, String password) {
            clickOnSignUpLink();
            enterUsername(username);
            enterPassword(password);
            clickOnSignUpButton();
        }
    }

