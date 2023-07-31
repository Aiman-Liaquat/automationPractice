package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InfiniteScrollPage {
    WebDriver driver;
    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }
    private By paragraphs = new By.ByXPath("(//div[@class='jscroll-added'])");

    public void goToParagraph(int index){
        List<WebElement> ParagraphsElement = driver.findElements(paragraphs);
        do {
            String script = "window.scrollTo(0, document.body.scrollHeight);";
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(script);
        }
        while(getParagraphElementSize()<index);
    }
    private int getParagraphElementSize(){
        return driver.findElements(paragraphs).size();
    }



}
