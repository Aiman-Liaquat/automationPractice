package tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class FileDownloaderTest extends BaseTest {
    @Test
    public void verifyFileDownloader() {
        var fileDownloaderPage = homePage.GotoFileDownloaderPage();


        fileDownloaderPage.clickFile();
      //  fileDownloaderPage.isFileDownloaded("C:/Users/Aymen Liaquat/Desktop/Automate_Download","Automate_Download");
    }
}
