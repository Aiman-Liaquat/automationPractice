package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;
    public CheckBoxPage(WebDriver driver){
        this.driver = driver;
    }
    private By checkbox1 = new By.ByCssSelector("input:nth-child(1)");
    private By checkbox2 = new By.ByCssSelector("input:nth-child(3)");

    public void selectCheckBox1() {
        if (driver.findElement(checkbox1).getAttribute("checked") == null) {
            System.out.println("Checkbox is unchecked.");
            driver.findElement(checkbox1).click();
        }
        else {
            System.out.println("Checkbox is already checked.");
        }
    }
    public void selectCheckBox2() {
        if (driver.findElement(checkbox2).getAttribute("checked") == null) {
            System.out.println("Checkbox is unchecked.");
            driver.findElement(checkbox2).click();
        }
        else {
            System.out.println("Checkbox is already checked.");
        }
    }
}
