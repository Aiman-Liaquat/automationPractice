package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.UploadFilePage;

public class UploadFileTest extends BaseTest {
    @Test
    public void verifyFileUpload(){
        var uploadFilePage = homePage.GotoUploadFilePage();
        uploadFilePage.uploadFile("C:/Users/Aymen Liaquat/Desktop/MyList.txt");
       System.out.println(uploadFilePage.getTextFound() + " File Uploaded!");

    }
}
