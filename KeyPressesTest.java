package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {
    @Test
    public void verifyKeyPresses(){
        var keypressespage = homePage.GotoKeyPressesPage();
        keypressespage.enterText("S");
        Assert.assertEquals(keypressespage.getResultText(), "You entered: S", "textBox value entered is  correct");
        keypressespage.enterHash();
        Assert.assertEquals(keypressespage.getResultText(), "You entered: 3", "textBox value entered is correct");
        keypressespage.enterBackSpace();
        Assert.assertEquals(keypressespage.getResultText(), "You entered: BACK_SPACE", "textBox value entered is correct" );
        keypressespage.enterPercentage();
        Assert.assertEquals(keypressespage.getResultText(), "You entered: 5", "textBox value entered is correct");
        keypressespage.enterComma();
        Assert.assertEquals(keypressespage.getResultText(), "You entered: COMMA", "textBox value entered is correct");


    }

}
