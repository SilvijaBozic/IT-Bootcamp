package POM_WORDPRESS_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordPress_HomePage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement LogInButton;

    public WordPress_HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getLogInButton() {
        return driver.findElement(By.linkText("Log In"));
    }
    public void clickOnLogInButton() {
        getLogInButton().click();
    }
}
