package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversElementsPage {
    WebDriver driver;
    public HoversElementsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By figure = new By.ByCssSelector("div.figure");
    private By figCaption = new By.ByCssSelector("div.figcaption");

    public FigureCaption hoverOnFigureUsingIndex(int index)
    {
        WebElement figureElement = driver.findElements(figure).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figureElement).perform();
        return  new FigureCaption(figureElement.findElement(figCaption));
    }
    public class FigureCaption{
        WebElement caption;
        private By name = new By.ByTagName("h5");
        private By link = new By.ByTagName("a");

        public FigureCaption (WebElement figcap){
            this.caption = figcap;
        }
        public String getName(){
            return caption.findElement(name).getText();
        }
        public String getUrlLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText()
        {
            return caption.findElement(link).getText();
        }

        public boolean displayed()
        {
            return caption.isDisplayed();
        }

    }
}
