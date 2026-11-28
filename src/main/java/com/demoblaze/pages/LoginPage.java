package com.demoblaze.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By loginLinkLocator = By.xpath("//a[@id='login2']");
    private By usernameFieldLocator = By.xpath("//input[@id='loginusername']");
    private By passwordFieldLocator = By.xpath("//input[@id='loginpassword']");
    private By loginButtonLocator = By.xpath("//button[@onclick='logIn()']");
    private By welcomeUserLocator = By.xpath("//a[@id='nameofuser']");
    private By logoutLinkLocator = By.xpath("//a[@id='logout2']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //to help assert if the user is logged in
    public boolean isWelcomeUserDisplayed() {
        return isElementDisplayed(welcomeUserLocator);
    }

    public String getWelcomeText() {
        return wait.until(org.openqa.selenium.support.ui.ExpectedConditions
                .visibilityOfElementLocated(welcomeUserLocator)).getText();
    }

    //to help assert if the user is logged out
    public boolean isLoginLinkDisplayed() {
        return isElementDisplayed(loginLinkLocator);
    }

    //clicking on Log in link in the navbar
    public void clickOnLoginLink() {
        myClick(loginLinkLocator);
    }

    //typing the username
    public void enterUsername(String username) {
        mySendKeys(usernameFieldLocator, username);
    }

    //typing the password
    public void enterPassword(String password) {
        mySendKeys(passwordFieldLocator, password);
    }

    //clicking on Log in button inside the form
    public void clickOnLoginButton() {
        myClick(loginButtonLocator);
    }

    //clicking on Log out
    public void clickOnLogout() {
        myClick(logoutLinkLocator);
    }

    //full login steps
    public void login(String username, String password) {
        clickOnLoginLink();
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();
    }
}

