package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverElementsTest extends BaseTest {
    @Test
    public void verifyHoverElement(){
        var hoversElementsPage = homePage.GotoHoversElementsPage();
        var caption = hoversElementsPage.hoverOnFigureUsingIndex(3);
        Assert.assertTrue(caption.displayed(), "Caption is not displayed");
        Assert.assertEquals(caption.getName(), "name: user3", "Name displayed is not correct");
        Assert.assertTrue(caption.getUrlLink().endsWith("/users/3"), "Url is not correct");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Link text is not correct");
    }
}
