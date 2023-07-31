package tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.JavaScriptAlertsPage;


public class JavaScriptAlertsTest extends BaseTest {

        @Test
       //JavaScript Click Alert
        public void A1() {


            var javaScriptAlertPage = homePage.GotoJavaScriptAlertsPage();
            javaScriptAlertPage.clickAlertTrigger();
            Assert.assertEquals(javaScriptAlertPage.getTextFromJavaScriptAlert(),"I am a JS Alert");
            javaScriptAlertPage.okJavaScriptAlert();
            Assert.assertEquals(javaScriptAlertPage.getResultText(), "You successfully clicked an alert");
            javaScriptAlertPage.navigateBackToHomePage();
        }

        @Test
        //JavaScript Confirm Alert OK And Cancel
        public void A2() {

            var javaScriptAlertPage = homePage.GotoJavaScriptAlertsPage();
            javaScriptAlertPage.clickConfirmJsAlert();
            Assert.assertEquals(javaScriptAlertPage.getTextFromJavaScriptAlert(), "I am a JS Confirm");
            // javaScriptAlertPage.okJavaScriptAlert();
            //Assert.assertEquals(javaScriptAlertPage.getResultText(),"You clicked: Ok");
            javaScriptAlertPage.cancelJavaScriptAlert();
            Assert.assertEquals(javaScriptAlertPage.getResultText(), "You clicked: Cancel");
            javaScriptAlertPage.navigateBackToHomePage();
        }
        @Test
        //JavaScript Prompt Alert OK And Cancel
        public void A3() {
            var javaScriptAlertPage = homePage.GotoJavaScriptAlertsPage();
            javaScriptAlertPage.clickJavaScriptPromptAlert();
            javaScriptAlertPage.enterTextInJsPromptAlert("Hello");
            //javaScriptAlertPage.okJavaScriptAlert();
            // javaScriptAlertPage.getResultText();
            javaScriptAlertPage.cancelJavaScriptAlert();
            System.out.println(javaScriptAlertPage.getResultText());
        }






    }

