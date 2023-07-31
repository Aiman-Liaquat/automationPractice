package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileDownloaderPage {
    WebDriver driver;
    public FileDownloaderPage(WebDriver driver){
        this.driver = driver;
    }
    private By downloadLink= new By.ByLinkText("LambdaTest.txt");

    public void clickFile(){
        driver .findElement(downloadLink).click();
    }
}
