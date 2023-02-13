package SaucedemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement Username;
    WebElement Password;
    WebElement submitButton;

    WebElement errorNotification;

    WebElement cart;

    public WebElement getCart() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getErrorNotification() {
        return driver.findElement(By.cssSelector(".error-message-container.error"));
    }

    public WebElement getUsername() {
        return driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("login-button"));
    }

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void insertUsername(String username){
        getUsername().clear();
        getUsername().sendKeys(username);
    }
    public void insertPassword(String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }
    public void clickOnSubmitButton(){
        getSubmitButton().click();

    }
    public void clickOnCart(){
        getCart().click();
    }

}
