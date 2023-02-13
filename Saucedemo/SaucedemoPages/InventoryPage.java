package SaucedemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement SauceLabsBackpack;
    WebElement SauceLabsBikeLight;
    WebElement SauceLabsBoltTShirt;
    WebElement SauceLabsFleeceJacket;
    WebElement SauceLabsOnesie;
    WebElement TestallTheThingsTShirtRed;
    WebElement clickOnAddToCartSauceLabBackPack;



    WebElement removeSaucLabsBackpack;
    WebElement cart;
    public InventoryPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCart() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getClickOnAddToCartSauceLabBackPack() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }



    public WebElement getSauceLabsBackpack() {
        return driver.findElement(By.linkText("Sauce Labs Backpack"));
    }

    public WebElement getSauceLabsBikeLight() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getSauceLabsBoltTShirt() {
        return SauceLabsBoltTShirt;
    }

    public WebElement getSauceLabsFleeceJacket() {
        return SauceLabsFleeceJacket;
    }

    public WebElement getSauceLabsOnesie() {
        return SauceLabsOnesie;
    }

    public WebElement getTestallTheThingsTShirtRed() {
        return TestallTheThingsTShirtRed;
    }
    public WebElement getRemoveSaucLabsBackpack() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public void clickOnSauceLabsBackPack(){
        getSauceLabsBackpack().click();
    }
    public void addToCartSauceLabsBackPack(){
        getClickOnAddToCartSauceLabBackPack().click();
    }

    public void clickOnSauceLabsBikeLight(){
        getSauceLabsBikeLight().click();
    }
    public void clickOnRemoveSaucLabsBackpack(){
        getRemoveSaucLabsBackpack().click();
    }

}
