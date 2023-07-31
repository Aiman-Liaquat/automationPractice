package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WYSIWYGEditorPage {
    WebDriver driver;
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }
    private By textBox = new By.ById("tinymce");
    private By pageTitle = new By.ByCssSelector("div[class='example'] h3");
    private By increaseIndentBtn = new By.ByXPath("//button[@title='Increase indent']");
    private By decreaseIndentBtn = new By.ByXPath("//button[@title='Decrease indent']");
    private By selectText = new By.ByXPath("//iframe[@id='mce_0_ifr']");
    private By boldBtn = new By.ByXPath("//button[@title='Bold']");
    private By italicBtn = new By.ByXPath("//button[@title='Italic']");

    private void switchToIFrame(){
        driver.switchTo().frame(0);
    }

    private void switchToParentFrame()
    {
        driver.switchTo().parentFrame();
    }
    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }
    public void clearTextEditor(){
        switchToIFrame();
        driver.findElement(textBox).clear();
        switchToParentFrame();
    }
    public void enterTextInEditor(String text){
        switchToIFrame();
        driver.findElement(textBox).sendKeys(text);
        switchToParentFrame();
    }
    public String getTextFromtheEditor()
    {
        String text;
        switchToIFrame();
        text = driver.findElement(textBox).getText();
        switchToParentFrame();
        return text;
    }
    public void increaseIndentText(){
        driver.findElement(increaseIndentBtn).click();
    }
    public void decreaseIndentText(){
        driver.findElement(decreaseIndentBtn).click();
    }
    public void boldAndItalicSelectedText(){

        // Create Actions object
        Actions actions = new Actions(driver);

        // Use keyDown and sendKeys methods to simulate the "Ctrl+A" keyboard shortcut
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        driver.findElement(selectText).sendKeys(Keys.CONTROL + "a");
        driver.findElement(boldBtn).click();
        driver.findElement(italicBtn).click();
    }

}
