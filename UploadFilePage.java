package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    WebDriver driver;
    public UploadFilePage(WebDriver driver){
        this.driver = driver;
    }

    private By chooseFileInput = new By.ById("file-upload");
    private By uploadButton = new By.ById("file-submit");

    private By textFound = new By.ById("uploaded-files");

    public void uploadFile(String absoulteAddress){
        driver.findElement(chooseFileInput).sendKeys(absoulteAddress);
        driver.findElement(uploadButton).click();
    }
    public String getTextFound(){
        return driver.findElement(textFound).getText();
    }


}
