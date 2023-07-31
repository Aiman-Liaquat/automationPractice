package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPage {
    WebDriver driver;
    public InputPage(WebDriver driver){
        this.driver = driver;
    }
    private By title = new By.ByCssSelector("div[class='large-6 small-12 columns large-centered'] h3");
    private By numberField= new By.ByCssSelector("input[type='number']");

    public String getTitle(){
        return driver.findElement(title).getText();
    }
    public void enterValueInNumberField(String value){
        driver.findElement(numberField).sendKeys(value);
    }
    public String getValueInNumberField(){
        return driver.findElement(numberField).getText();
    }
}
