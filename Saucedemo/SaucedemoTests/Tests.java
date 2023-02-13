package SaucedemoTests;

import SaucedemoBase.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends Base {
    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    //prikazuje gresku za username u prvom testu, zasto?
    // u testu userIsUnableToLogInWithInvalidPassword prihvata username
    @Test
    public void userCanLogIn1() {
            String validUserName = excelReader.getStringData("USER", 1, 0);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            homePage.insertUsername(validUserName); //uneo mi je username i test je prosao ali sam dobila rezultat failed?
            homePage.insertPassword(validPassword);
            homePage.clickOnSubmitButton();
            String URL = "https://www.saucedemo.com/inventory.html";
            Assert.assertEquals(URL, driver.getCurrentUrl());
        }


    @Test
    public void userCanLogIn2() {
        String validUserName = excelReader.getStringData("USER", 2, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        homePage.insertUsername(validUserName); //uneo mi je username i test je prosao ali sam dobila rezultat failed?
        // drugi put sam napravila petlju da prodje kroz sve i nije se ulogovao ali mi je test prosao?
        homePage.insertPassword(validPassword);
        homePage.clickOnSubmitButton();
        String expectedNotification = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(expectedNotification, homePage.getErrorNotification().getText());
    }

    @Test
    public void userCanLogIn3() {
        String validUserName = excelReader.getStringData("USER", 3, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        homePage.insertUsername(validUserName);
        homePage.insertPassword(validPassword);
        homePage.clickOnSubmitButton();
        String URL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(URL, driver.getCurrentUrl());

    }

    @Test
    public void userCanLogIn4() {
        String validUserName = excelReader.getStringData("USER", 4, 0);
        String validPassword = excelReader.getStringData("USER", 1, 1);
        homePage.insertUsername(validUserName);
        homePage.insertPassword(validPassword);
        homePage.clickOnSubmitButton();
        String URL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(URL, driver.getCurrentUrl());

    }

    @Test
    public void userCanNotLogInWithInvalidUserName() {
        for (int i = 1; i < excelReader.getLastRow("USER"); i++) {
            String invalidUsername = excelReader.getStringData("USER", i, 2);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            homePage.insertUsername(invalidUsername);
            homePage.insertPassword(validPassword);
            homePage.getSubmitButton().click();
            String expectedNotification = "Epic sadface: Username and password do not match any user in this service";
            Assert.assertEquals(expectedNotification, homePage.getErrorNotification().getText());
        }
    }

        @Test
        public void userIsUnableToLogInWithInvalidPassword () {
            for (int i = 1; i <= excelReader.getLastRow("USER"); i++) {
                String validUsername = excelReader.getStringData("USER", 1, 0);
                String invalidPassword = excelReader.getStringData("USER", i, 3);
                homePage.insertUsername(validUsername);
                homePage.insertPassword(invalidPassword);
                homePage.getSubmitButton().click();
                String expectedNotification = "Epic sadface: Username and password do not match any user in this service";
                Assert.assertEquals(expectedNotification, homePage.getErrorNotification().getText());
            }
        }

        @Test
    public void putBookInCart(){
            String validUserName = excelReader.getStringData("USER", 1, 0);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            homePage.insertUsername(validUserName);
            homePage.insertPassword(validPassword);
            homePage.clickOnSubmitButton();

            String cartBeforeAdding = homePage.getCart().getText();
            Assert.assertEquals(cartBeforeAdding, "");
            inventoryPage.addToCartSauceLabsBackPack();
            String CartAfterAddingItem = inventoryPage.getCart().getText();
            Assert.assertEquals(CartAfterAddingItem, "1");
        }
        @Test
    public void putSecondBookInCart(){
            String validUserName = excelReader.getStringData("USER", 1, 0);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            homePage.insertUsername(validUserName);
            homePage.insertPassword(validPassword);
            homePage.clickOnSubmitButton();
            String cartBeforeAdding = homePage.getCart().getText();
            Assert.assertEquals(cartBeforeAdding, "");
            inventoryPage.addToCartSauceLabsBackPack();
            String CartAfterAddingItem = inventoryPage.getCart().getText();
            Assert.assertEquals(CartAfterAddingItem, "1");
            inventoryPage.clickOnSauceLabsBikeLight();
            String CartAfterAddingSecondItem = inventoryPage.getCart().getText();
            Assert.assertEquals(CartAfterAddingSecondItem, "2");
        }

        @Test
    public void DeleteOneBook(){
            String validUserName = excelReader.getStringData("USER", 1, 0);
            String validPassword = excelReader.getStringData("USER", 1, 1);
            homePage.insertUsername(validUserName);
            homePage.insertPassword(validPassword);
            homePage.clickOnSubmitButton();
            String cartBeforeAdding = homePage.getCart().getText();
            Assert.assertEquals(cartBeforeAdding, "");
            inventoryPage.addToCartSauceLabsBackPack();
            String CartAfterAddingItem = inventoryPage.getCart().getText();
            Assert.assertEquals(CartAfterAddingItem, "1");
            inventoryPage.clickOnSauceLabsBikeLight();
            String CartAfterAddingSecondItem = inventoryPage.getCart().getText();
            Assert.assertEquals(CartAfterAddingSecondItem, "2");
            homePage.getCart().click();
            inventoryPage.clickOnRemoveSaucLabsBackpack();
            String CartAfterDeletingItem = inventoryPage.getCart().getText();
            Assert.assertEquals(CartAfterDeletingItem, "1");
        }
 }

