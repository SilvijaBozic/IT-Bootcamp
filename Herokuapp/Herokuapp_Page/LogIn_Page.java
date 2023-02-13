package Herokuapp_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn_Page {
        WebDriver driver;
        WebDriverWait wdwait;

        WebElement Username;
        WebElement Password;
        WebElement LogInButton;

        WebElement notification;

    public WebElement getNotification() {
        return driver.findElement(By.id("flash"));
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    }

    public LogIn_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void inputUsername (String username){
        getUsername().clear();
        getUsername().sendKeys(username);
    }
    public void inputPassword (String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void clickOnLogInButton(){
        getLogInButton().click();
    }

}
