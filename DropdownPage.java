package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage {
    WebDriver driver;
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    private By dropdown =  new By.ById("dropdown");

    public void showDropdownoptions(){
        Select select = new Select(driver.findElement(dropdown));
        List<WebElement> list =  select.getOptions();
        for (WebElement we:list)
        {
           System.out.println(we.getText());
        }
    }
    public void selectOptions(String option){
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(option);
    }
    public void selectOptionIndex(int index){
        Select select = new Select(driver.findElement(dropdown));
        select.selectByIndex(index);
    }
    public String getSlectedOption(){
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }


}
