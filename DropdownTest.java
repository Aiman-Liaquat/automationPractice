package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import page.CheckBoxPage;
import page.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void TestDropdownPage(){
        DropdownPage dropdownPage = homePage.GotoDropDownPage();
        dropdownPage.showDropdownoptions();
        dropdownPage.selectOptions("Option 2");
        System.out.println("Option Selected is " + dropdownPage.getSlectedOption());

        dropdownPage.selectOptionIndex(1);
        System.out.println("Option Selected is " + dropdownPage.getSlectedOption());


    }


}
