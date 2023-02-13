package LOGIN_TESTS;

import LOGIN_BASE.LOGIN_BASE;
import LOGIN_PAGE.HomePage;
import LOGIN_PAGE.LogOut;
import LOGIN_PAGE.PracticeTestLogIn;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class LogInTests extends LOGIN_BASE {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(homeURL);
        homePage = new HomePage(driver, wdwait);
        practiceTestLogIn = new PracticeTestLogIn(driver, wdwait);
        logOut = new LogOut(driver, wdwait);
    }

    @Test
    public void userCanLogIn() {
        homePage.clickOnPracticePage();
        practiceTestLogIn.clickOnTestLogInButton();
        String validUserName = excelReader.getStringData("USER", 1, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        practiceTestLogIn.inputUsername(validUserName);
        practiceTestLogIn.inputPassword(validPassword);
        practiceTestLogIn.clickSubmitButton();
        Assert.assertTrue(practiceTestLogIn.getLogOutButton().isDisplayed());
    }

    @Test
    public void userCanLogOut() {
        homePage.clickOnPracticePage();
        practiceTestLogIn.clickOnTestLogInButton();
        String validUserName = excelReader.getStringData("USER", 1, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        practiceTestLogIn.inputUsername(validUserName);
        practiceTestLogIn.inputPassword(validPassword);
        practiceTestLogIn.clickSubmitButton();
        practiceTestLogIn.clickOnLogOutButton();
        Assert.assertTrue(practiceTestLogIn.getUsername().isDisplayed());
        Assert.assertTrue(practiceTestLogIn.getPassword().isDisplayed());
        Assert.assertTrue(practiceTestLogIn.getSubmitButton().isDisplayed());
    }

    @Test
    public void userCanNotLogInWithIncorrectUsername() {
        homePage.clickOnPracticePage();
        practiceTestLogIn.clickOnTestLogInButton();
        //pravimo petlju da bismo prosli kroz sve username koje smo definisali u excel fajlu
        //i = 1  -> krecemo od 1 ne 0 jer od jedinice krecu username, na 0 smo definisali naziv kolone
        //za invalid username po redovima se menjaju username koji su smesteni u kolonu broj 2
        //za valid password uzimamo vrednost koju smo uneli u redu broj:1 i koloni:1
        for (int i = 1; i < excelReader.getLastRow("USER"); i++) {
            String invalidUsername = excelReader.getStringData("USER", i, 2);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            practiceTestLogIn.inputUsername(invalidUsername);
            practiceTestLogIn.inputPassword(validPassword);
            practiceTestLogIn.clickSubmitButton();
            String errorNotification = "Your username is invalid!";
            Assert.assertEquals(errorNotification, practiceTestLogIn.getError().getText());
            Assert.assertTrue(practiceTestLogIn.getUsername().isDisplayed());
            Assert.assertTrue(practiceTestLogIn.getPassword().isDisplayed());
        }
    }

    @Test
    public void userCanNotLogInWithIncorrectPassword() {
        homePage.clickOnPracticePage();
        practiceTestLogIn.clickOnTestLogInButton();
        String validUserName = excelReader.getStringData("USER", 1, 0);
        String invalidPassword = excelReader.getStringData("USER", 1, 3);
        practiceTestLogIn.inputUsername(validUserName);
        practiceTestLogIn.inputPassword(invalidPassword);
        practiceTestLogIn.clickSubmitButton();
        String actualURL = excelReader.getStringData("URL", 1, 1);
        // u excel fajl stavljamo url koji postoji kada se log in-ujemo
        // i njega uporedjujemo sa url-om na stranici kada ne uspemo da se log in-ujemo
        Assert.assertNotEquals(driver.getCurrentUrl(), actualURL);
        Assert.assertTrue(practiceTestLogIn.getUsername().isDisplayed());
        Assert.assertTrue(practiceTestLogIn.getPassword().isDisplayed());
    }

    @Test
    public void userCanNotLogInWithIncorrectUsernameandPassword() {
        for (int i = 1; i < excelReader.getLastRow("USER"); i++) {
            String invalidUsername = excelReader.getStringData("USER", i, 2);
            String invalidPassword = excelReader.getStringData("USER", i, 3);
            practiceTestLogIn.inputUsername(invalidUsername);
            practiceTestLogIn.inputPassword(invalidPassword);
            practiceTestLogIn.clickSubmitButton();
           String actualURL = excelReader.getStringData("URL", 1, 1);
            // u excel fajl stavljamo url koji postoji kada se log in-ujemo
            // i njega uporedjujemo sa url-om na stranici kada ne uspemo da se log in-ujemo
            Assert.assertNotEquals(driver.getCurrentUrl(), actualURL);
            Assert.assertTrue(practiceTestLogIn.getUsername().isDisplayed());
            Assert.assertTrue(practiceTestLogIn.getPassword().isDisplayed());
        }
    }
}
