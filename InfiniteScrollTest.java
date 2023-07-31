package tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTest {
@Test
    public void verifyScrollToParagraph(){
    var infiniteScrollPage = homePage.GotoInfiniteScrollPage();
    infiniteScrollPage.goToParagraph(6);

}
}
