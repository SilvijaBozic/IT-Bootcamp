package Herokuapp_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut_Page {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement logOutButton;

    public LogOut_Page(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector("icon-2x.icon-signout"));
    }

    public void clickOnLogOutButton(){
        getLogOutButton().click();
    }
}
