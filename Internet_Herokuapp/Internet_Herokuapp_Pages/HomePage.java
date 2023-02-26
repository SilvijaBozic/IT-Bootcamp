package Internet_Herokuapp_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement keyPressButton;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getKeyPressButton() {
        return driver.findElement(By.linkText("Key Presses"));
    }

    //---------------------------------

    public void clickOnKeyPressButton(){
        getKeyPressButton().click();
    }
}
