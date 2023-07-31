package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CheckBoxPage;
import page.CheckBoxPage;

public class CheckBoxTest extends BaseTest {

    @Test
    public void TestCheckBoxPage(){
        CheckBoxPage checkBoxPage = homePage.GotoCheckBoxPage();
        checkBoxPage.selectCheckBox1();
        checkBoxPage.selectCheckBox2();


    }


}
