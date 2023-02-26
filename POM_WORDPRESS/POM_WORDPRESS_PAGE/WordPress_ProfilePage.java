package POM_WORDPRESS_PAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordPress_ProfilePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement profileIcon;

    public WordPress_ProfilePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getProfileIcon() {
        return driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar"));
    }
}
