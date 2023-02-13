package SeleniumUvod;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://wordpress.com/");
        WebElement logInButton = driver.findElement(By.linkText("Log In"));
        logInButton.click();

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.id("usernameOrEmail"));
        String email = "silwija.95@gmail.com";
        emailField.sendKeys(email);

        Thread.sleep(5000);
        WebElement continueButton = driver.findElement(By.cssSelector(".button.form-button.is-primary"));
        continueButton.click();
        Thread.sleep(5000);
        WebElement password = driver.findElement(By.id("password"));
        String passwordField = "Silvija123/";
        password.sendKeys(passwordField);
        Thread.sleep(5000);
        WebElement clickOnLogIn = driver.findElement(By.cssSelector(".button.form-button.is-primary"));
        clickOnLogIn.click();
        Thread.sleep(5000);
        WebElement loveMatch095 = driver.findElement(By.className("site__title"));
        String username = "lovematch05";
        Assert.assertEquals(loveMatch095.getText(),username);

        //deleting cookies we automatically sing out
        //driver.manage().deleteAllCookies();
        //driver.navigate().refresh();



    }

}
