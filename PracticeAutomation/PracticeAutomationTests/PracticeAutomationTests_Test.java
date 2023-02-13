package PracticeAutomationTests;

import PracticeAutomationBase.PracticeAutomationBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeAutomationTests_Test extends PracticeAutomationBase {
    //12. Test klasa treba da ekstenduje BaseTest klasu
    //13. Kreiramo metodu pageSetUp koja ima anotaciju BeforeMethod
    //sto znaci da ce se ova metoda izvrsiti pre svakog testa

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");
    }

    //14. Kreiram testove tako sto naziv metode dajem kako bih nazvala i manuelno napisan test case
    @Test
    public void userCanLogIn() {
        //15. Nazivi metoda akcija treba da nose nazive kao da pisemo korake u test case-u
        practiceAutomationSideBarPage.clickOnPracticeButton();
        practiceAutomationPracticePage.clickOnTestLoginPageButton();
        practiceAutomationLogInPage.insertUsername("student");
        practiceAutomationLogInPage.insertPassword("Password123");
        practiceAutomationLogInPage.clickOnSubmitButton();
        Assert.assertTrue(practiceAutomationLogInPage.getSubmitButton().isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidUsername() {
        practiceAutomationSideBarPage.clickOnPracticeButton();
        practiceAutomationPracticePage.clickOnTestLoginPageButton();
        practiceAutomationLogInPage.insertUsername("username");
        practiceAutomationLogInPage.insertPassword("Password123");
        practiceAutomationLogInPage.clickOnSubmitButton();
    }
}
