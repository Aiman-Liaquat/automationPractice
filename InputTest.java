package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.InputPage;

public class InputTest extends BaseTest {

    @Test
    public void TestInputPage(){
        InputPage inputPage = homePage.GoToInputPage();
        Assert.assertEquals(inputPage.getTitle(), "Input", "Input Page Title should be Inputs");
        inputPage.enterValueInNumberField("abc");
        System.out.println(inputPage.getValueInNumberField());
        Assert.assertEquals(inputPage.getValueInNumberField(), "", "It should be empty in case of alphabetic");
    }


}
