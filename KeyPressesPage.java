package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressesPage {
    WebDriver driver;
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    private By textbox = new By.ById("target");
    private By result = new By.ById("result");

    public void enterText(String text){
        driver.findElement(textbox).sendKeys(text);
    }
    public String getResultText(){
        return driver.findElement(result).getText();

    }
    public void enterBackSpace(){
        driver.findElement(textbox).sendKeys(Keys.BACK_SPACE);
    }
    public void enterHash(){
        driver.findElement(textbox).sendKeys(Keys.chord(Keys.SHIFT, "3"));
    }
    public void enterPercentage(){
        driver.findElement(textbox).sendKeys(Keys.chord(Keys.SHIFT, "5"));
    }
    public void enterComma(){
        driver.findElement(textbox).sendKeys(Keys.SEPARATOR);
    }


}
