package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class JavaScriptAlertsPage {
    WebDriver driver;
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver= driver;
    }
    private By javaScriptAlertTrigger = new By.ByCssSelector("button[onclick='jsAlert()']");
    private By result = new By.ById("result");
    private By javaScriptAlertConfirm = new By.ByCssSelector("button[onclick='jsConfirm()']");
    private By javaScriptPromptAlert = new By.ByCssSelector("button[onclick='jsPrompt()']");

    public void clickAlertTrigger(){
        driver.findElement(javaScriptAlertTrigger).click();
    }
    public String getResultText(){
        return driver.findElement(result).getText();
    }
    public void okJavaScriptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getTextFromJavaScriptAlert(){
       return driver.switchTo().alert().getText();
    }

    public void clickConfirmJsAlert(){
        driver.findElement(javaScriptAlertConfirm).click();
    }
    public void cancelJavaScriptAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void clickJavaScriptPromptAlert(){
        driver.findElement(javaScriptPromptAlert).click();
    }
    public void enterTextInJsPromptAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void navigateBackToHomePage(){
        driver.navigate().back();
    }





}
