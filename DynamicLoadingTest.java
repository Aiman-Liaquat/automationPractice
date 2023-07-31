package tests;
import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Example1Page;

public class DynamicLoadingTest extends BaseTest{
    @Test
    public void VerifyHelloWorldForExample1()
    {
        //var dynamicLoadingPage = homePage.goToDynamicLoadingPage();
        //dynamicLoadingPage.goToExample1();
        //var example1Page = homePage.GotoDynamicLoadingPage().gotoExample1();
        var example2Page = homePage.GotoDynamicLoadingPage().gotoExample2();
        example2Page.clickStart();
        //Assert.assertEquals(example1Page.getTextFound(), "Hello World!");
        Assert.assertEquals(example2Page.getTextFound(), "Hello World!");
    }

}
