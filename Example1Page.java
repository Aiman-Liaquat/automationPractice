package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;


public class Example1Page {
    WebDriver driver;
    public Example1Page(WebDriver driver){
        this.driver = driver;
    }

    private By startbtn = new By.ByCssSelector("div[id='start'] button");
    private By loadingIcon = new By.ById("loading");
    private By textfound = new By.ById("finish");

    public void clickStart(){
        driver.findElement(startbtn).click();
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIcon)));

    }
    public String getTextFound(){
        return driver.findElement(textfound).getText();
    }

}
