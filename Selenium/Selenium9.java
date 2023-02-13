package SeleniumUvod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class Selenium9 {
        //PRIMER ZADATKA SA ANOTACIJOM
        //uloguj se i assertuj da si ulogovan

        WebDriver driver;
        //inace ces stavljati i WebDriverWait iliti wdwait pa ga definisati u beforeclass

        @BeforeClass
        public void setUp() {
            //UVEK ISTO STAVLJAMO U BEFORE KLASU
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @BeforeMethod
        public void pageSetUp() {
            //UVEK ISTO STAVLJAMO U BEFORE METOD
            driver.manage().window().maximize();
            driver.navigate().to("https://practicetestautomation.com/");
        }

        @Test
        public void userCanLogIn() {
        WebElement practicePage = driver.findElement(By.id("menu-item-20"));
        practicePage.click();
        WebElement testLogInPage = driver.findElement(By.linkText("Test Login Page"));
        testLogInPage.click();
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        WebElement logOutButton = driver.findElement(By.linkText("Log out"));
       // logOutButton.click();
       // Assert.assertTrue(logOutButton.isDisplayed());
        WebElement notification = driver.findElement(By.className("post-title"));
        Assert.assertEquals(notification.getText(), "Logged In Successfully");
        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
        }
           /* WebElement practiceButton = driver.findElement(By.id("menu-item-20"));
            practiceButton.click();
            WebElement testLoginPageButton = driver.findElement(By.linkText("Test Login Page"));
            testLoginPageButton.click();
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("student");
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Password123");
            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();
            WebElement logOutButton = driver.findElement(By.linkText("Log out"));
            Assert.assertTrue(logOutButton.isDisplayed());
            WebElement notification = driver.findElement(By.className("post-title"));
            Assert.assertEquals(notification.getText(), "Logged In Successfully");
            Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
        }

        @Test
        public void userCanLogOut() {


        }*/

        }
