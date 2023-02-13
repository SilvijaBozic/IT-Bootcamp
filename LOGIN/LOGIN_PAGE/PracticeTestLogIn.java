package LOGIN_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeTestLogIn {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement username;
    WebElement password;
    WebElement submitButton;

    WebElement logOutButton;

    WebElement testLogInButton;

    WebElement error;

    public WebElement getError() {
        return driver.findElement(By.id("error"));
    }

    public WebElement getTestLogInButton() {
        return driver.findElement(By.linkText("Test Login Page"));
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.linkText("Log out"));
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public PracticeTestLogIn(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void inputUsername(String username) {
        //ovde definisemo username i akcije nam njom, ocisti mi polje i unesi username
        getUsername().clear();
        getUsername().sendKeys(username);
    }

    public void inputPassword (String password) {
        //ovde definisemo password i akcije nam njom, ocisti mi polje i unesi password
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void clickSubmitButton (){
        // klikni na dugme
        getSubmitButton().click();
    }
    public void clickOnTestLogInButton(){
        getTestLogInButton().click();
    }
    public void clickOnLogOutButton(){
        getLogOutButton().click();
    }

}
