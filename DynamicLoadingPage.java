package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    private By example1Link = new By.ByLinkText("Example 1: Element on page that is hidden");
    private By example2Link = new By.ByLinkText("Example 2: Element rendered after the fact");

    public Example1Page gotoExample1(){
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }
    public Example1Page gotoExample2(){
        driver.findElement(example2Link).click();
        return new Example1Page(driver);
    }


}
