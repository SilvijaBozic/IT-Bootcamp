package LOGIN_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement logOutButton;

    public LogOut(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLogOutButton() {
        //definisem lokator preko kojeg dolazim do elementa
        return driver.findElement(By.linkText("Log out"));
    }

    public void clickOnLogOut(){

    }
}
