package LOGIN_PAGE;

import LOGIN_BASE.LOGIN_BASE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebElement practicePage;
    WebDriver driver;
    WebDriverWait wdwait;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPracticePage() {
        //ovo si mogla da napravis u PracticeTestLogIn
        //kreiras element i pomocu njegovog lokatora dolazis do tog elementa
        return driver.findElement(By.id("menu-item-20"));
    }

    public void clickOnPracticePage() {
        getPracticePage().click(); // pravis metodu pomocu koje ces da kliknes na practice page
    }
}
