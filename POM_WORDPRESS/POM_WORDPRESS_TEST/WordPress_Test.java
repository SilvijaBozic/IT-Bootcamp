package POM_WORDPRESS_TEST;

import POM_WORDPRESS_BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class WordPress_Test extends Base {
    //prvo kreiram before metod gde definisem da se chrome prozor maksimalno otvori i definisem url adresu
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
    }

    @org.testng.annotations.Test
    public void userCanlogIn() throws InterruptedException {
        wordpressLoginPage.insertUserName("majicm467@gmail.com");
        wordpressLoginPage.clickOnContinue();
        Thread.sleep(3000);
        wordpressLoginPage.insertPassword("majamajic1/");
        wordpressLoginPage.clickOnLogIn();
        WebElement profileHelpNotificationFields = driver.findElement(By.className("masterbar__section masterbar__section--right"));
        Assert.assertTrue(profileHelpNotificationFields.isDisplayed());
    }
}
