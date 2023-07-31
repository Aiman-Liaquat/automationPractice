package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
    WebDriver driver;
    public FormAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }
    private By username = new By.ById("username");
    private By password = new By.ById("password");
    private By loginBtn = new By.ByCssSelector("button[type='submit']");
    private By messageAfterLogin = new By.ByCssSelector("div[class='example'] h2");
    private By logoutBtn = new By.ByCssSelector(".button.secondary.radius");
    private By alertMessage = new By.ById("flash");


    public void enterUserName(String text){
        driver.findElement(username).sendKeys(text);
    }
    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
    }
    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }
    public String getMessageAfterLogin(){
       return driver.findElement(messageAfterLogin).getText();

    }
    public void clickLogoutBtn(){
        driver.findElement(logoutBtn).click();
    }
    public String getAlertMessage(){
       return driver.findElement(alertMessage).getText();
    }


}
