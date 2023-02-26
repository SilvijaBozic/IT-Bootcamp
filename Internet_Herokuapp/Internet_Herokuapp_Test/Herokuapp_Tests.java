package Internet_Herokuapp_Test;

import Internet_Herokuapp_Base.Herokuapp_Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Herokuapp_Tests extends Herokuapp_Base {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void userCanAddOneLetterInInput() {
        homePage.clickOnKeyPressButton();
        keyPressesPage.clickOnInputField();
        keyPressesPage.sendKeys("Y");
        Assert.assertTrue(keyPressesPage.getNotification().isDisplayed());

    }

    @Test
    public void userCanAddOneNumberInInput(){
        homePage.clickOnKeyPressButton();
        keyPressesPage.clickOnInputField();
        keyPressesPage.sendKeys("1");
        String message =keyPressesPage.getNotification().getText();
        Assert.assertTrue(keyPressesPage.getNotification().isDisplayed());

    }
}
