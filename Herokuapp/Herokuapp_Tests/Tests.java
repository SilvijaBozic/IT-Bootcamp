package Herokuapp_Tests;

import Herokuapp_Base.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends Base {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test
    public void userCanLogIn() {
        String validUserName = excelReader.getStringData("USER", 1, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        logIn_page.inputUsername(validUserName);
        logIn_page.inputPassword(validPassword);
        logIn_page.clickOnLogInButton();
        Assert.assertTrue(logOut_page.getLogOutButton().isDisplayed());

    }

    @Test
    public void userCanLogOut() {
        String validUserName = excelReader.getStringData("USER", 1, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        logIn_page.inputUsername(validUserName);
        logIn_page.inputPassword(validPassword);
        logIn_page.clickOnLogInButton();
        Assert.assertTrue(logOut_page.getLogOutButton().isDisplayed());
        logOut_page.clickOnLogOutButton();
        Assert.assertTrue(logIn_page.getUsername().isDisplayed());
        Assert.assertTrue(logIn_page.getPassword().isDisplayed());
        Assert.assertTrue(logIn_page.getLogInButton().isDisplayed());
    }

    @Test
    public void userCanNotLogInWithInvalidUsername() {
        for (int i = 1; i < excelReader.getLastRow("USER"); i++) {
            String invalidUserName = excelReader.getStringData("USER", i, 2);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            logIn_page.inputUsername(invalidUserName);
            logIn_page.inputPassword(validPassword);
            logIn_page.clickOnLogInButton();
            Assert.assertTrue(logIn_page.getNotification().isDisplayed());
            Assert.assertTrue(logIn_page.getUsername().isDisplayed());
            Assert.assertTrue(logIn_page.getPassword().isDisplayed());
        }
    }

    @Test
    public void userCanLogInWithInvalidPassword() {
        for (int i = 1; i < excelReader.getLastRow("USER"); i++) {
            String validUserName = excelReader.getStringData("USER", 1, 0);
            String invalidPassword = excelReader.getStringData("USER", i, 3);
            logIn_page.inputUsername(validUserName);
            logIn_page.inputPassword(invalidPassword);
            logIn_page.clickOnLogInButton();
            String notification = "Your password is invalid!";
            Assert.assertEquals(notification, logIn_page.getNotification().getText());
            Assert.assertTrue(logIn_page.getUsername().isDisplayed());
            Assert.assertTrue(logIn_page.getPassword().isDisplayed());
        }
    }

    @Test
    public void userCanLogInWithInvalidUsernameAndPassword() {
        for (int i = 1; i < excelReader.getLastRow("USER"); i++) {
            String invalidUserName = excelReader.getStringData("USER", i, 2);
            String invalidPassword = excelReader.getStringData("USER", i, 3);
            logIn_page.inputUsername(invalidUserName);
            logIn_page.inputPassword(invalidPassword);
            logIn_page.clickOnLogInButton();
            String notification = "Your username is invalid!";
            Assert.assertEquals(notification, logIn_page.getNotification().getText());
            Assert.assertTrue(logIn_page.getUsername().isDisplayed());
            Assert.assertTrue(logIn_page.getPassword().isDisplayed());
        }
    }

}
