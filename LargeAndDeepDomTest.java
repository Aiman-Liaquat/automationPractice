package tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class LargeAndDeepDomTest extends BaseTest {
    @Test
    public void verifyScroll(){
        var largeAndDeepDom = homePage.GotoLargeAndDeepDomPage();
        largeAndDeepDom.scrollToLargeTable();
    }
}
