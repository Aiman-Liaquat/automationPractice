package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
   private By inputPageLink = new By.ByCssSelector("a[href='/inputs']");
    private By checkBoxPageLink = new By.ByCssSelector("a[href='/checkboxes']");
   private By dropdownPageLink = new By.ByCssSelector("a[href='/dropdown']");
   private By dynamicLoadingPageLink = new By.ByCssSelector("a[href='/dynamic_loading']");
   private By uploadPageLink = new By.ByCssSelector("a[href='/upload']");
   private By wysiwygEditorPageLink = new By.ByCssSelector("a[href='/tinymce']");
   private By infiniteScrollPageLink = new By.ByCssSelector("a[href='/infinite_scroll']");
   private By getHoversPageLink = new By.ByCssSelector("a[href='/hovers']");
   private By jSAlertsPageLink = new By.ByCssSelector("a[href='/javascript_alerts']");
   private By keyPressesLink = new By.ByCssSelector("a[href='/key_presses']");
   private By largeAndDeepDomLink = new By.ByCssSelector("a[href='/large']");
   private By formAuthenticationLink = new By.ByCssSelector("a[href='/login']");
   private By fileDownloaderPageLink = new By.ByCssSelector("a[href='/download']");

   public InputPage GoToInputPage() {
       driver.findElement(inputPageLink).click();
       return new InputPage(driver);
   }

    public CheckBoxPage GotoCheckBoxPage(){
        driver.findElement(checkBoxPageLink).click();
        return new CheckBoxPage(driver);
    }

    public DropdownPage GotoDropDownPage(){
        driver.findElement(dropdownPageLink).click();
        return new DropdownPage(driver);
    }
    public DynamicLoadingPage GotoDynamicLoadingPage(){
        driver.findElement(dynamicLoadingPageLink).click();
        return new DynamicLoadingPage(driver);
    }

    public UploadFilePage GotoUploadFilePage(){
        driver.findElement(uploadPageLink).click();
        return new UploadFilePage(driver);
    }
    public WYSIWYGEditorPage GotoWysiwygEditorPage(){
       driver.findElement(wysiwygEditorPageLink).click();
       return new WYSIWYGEditorPage(driver);
    }
    public InfiniteScrollPage GotoInfiniteScrollPage(){
       driver.findElement(infiniteScrollPageLink).click();
       return new InfiniteScrollPage(driver);
    }
    public HoversElementsPage GotoHoversElementsPage(){
        driver.findElement(getHoversPageLink).click();
        return new HoversElementsPage(driver);
    }
    public JavaScriptAlertsPage GotoJavaScriptAlertsPage(){
        driver.findElement(jSAlertsPageLink).click();
        return new JavaScriptAlertsPage(driver);
    }
    public KeyPressesPage GotoKeyPressesPage(){
        driver.findElement(keyPressesLink).click();
        return new KeyPressesPage(driver);
    }
    public LargeAndDeepDomPage GotoLargeAndDeepDomPage(){
        driver.findElement(largeAndDeepDomLink).click();
        return new LargeAndDeepDomPage(driver);
    }
    public FormAuthenticationPage GotoFormAuthenticationPage(){
        driver.findElement(formAuthenticationLink).click();
        return new FormAuthenticationPage(driver);
    }
    public FileDownloaderPage GotoFileDownloaderPage(){
        driver.findElement(fileDownloaderPageLink).click();
        return new FileDownloaderPage(driver);
    }

}
