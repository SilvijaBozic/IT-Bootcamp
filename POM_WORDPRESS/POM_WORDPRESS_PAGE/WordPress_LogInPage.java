package POM_WORDPRESS_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordPress_LogInPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    //kreiramo konstruktore za driver i wdwait
    // getere za web elemente jer treba da ih dohvatimo preko lokatora
    WebElement emailAdress;
    WebElement password;
    WebElement continueButton;
    WebElement logInButton;
    public WordPress_LogInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getEmailAdress() {
        return driver.findElement(By.id("usernameOrEmail"));
    }

    public WebElement getPassword() {
        return  driver.findElement(By.id("password"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.cssSelector(".button.form-button.is-primary"));
    }

    public WebElement getLogInButton() {
        return driver.findElement(By.cssSelector(".button.form-button.is-primary"));
    }


    //pravis metode za prosledjivanje username, password, click on continue i click on logIn
    public void insertUserName(String emailAdress){
        getEmailAdress().clear();
        getEmailAdress().sendKeys(emailAdress);
    }
    public void insertPassword(String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }
    public void clickOnContinue(){
        getContinueButton();
    }
    public void clickOnLogIn(){
        getLogInButton().click();
    }
}
