package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    WebDriver driver;
    public LargeAndDeepDomPage(WebDriver driver){
        this.driver= driver;
    }
    private By largeTable = new By.ById("large-table");
    public void scrollToLargeTable(){
        WebElement largeTableElement = driver.findElement(largeTable);
        String script = "arguments[0].scrollIntoView();";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script,largeTableElement);
    }
}
