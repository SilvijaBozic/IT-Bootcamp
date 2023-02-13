package PracticeAutomationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAutomationProfilePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement logOutButton;
    WebElement title;

    public PracticeAutomationProfilePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.linkText("Log out"));
    }

    public WebElement getTitle() {
        return driver.findElement(By.className("post-title"));
    }

    //-------------------------

    public void clickOnLogOutButton() {
        getLogOutButton().click();
    }
}
