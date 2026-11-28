package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends utility{

    public static void scrollToElementJS(By locator){
        WebElement element = driver.findElement(locator);
        //we need the driver to execute this JS code that takes an argumnet and scrolls to it
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

    public static void clickJS(By locator){
        //clicking an element using javascript
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("argumnets[0].click();",element);
    }
}
