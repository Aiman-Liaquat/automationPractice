package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest {
@Test
    public void verifyFormAuthentication(){
    var formAuthenticationPage= homePage.GotoFormAuthenticationPage();
    formAuthenticationPage.enterUserName("tomsmith");
    formAuthenticationPage.enterPassword("SuperSecretPassword!");
    formAuthenticationPage.clickLoginBtn();
    System.out.println(formAuthenticationPage.getAlertMessage());
    Assert.assertEquals(formAuthenticationPage.getMessageAfterLogin(), "Secure Area", "You are not successfully logged in");
    formAuthenticationPage.clickLogoutBtn();
    System.out.println(formAuthenticationPage.getAlertMessage());
}
}
