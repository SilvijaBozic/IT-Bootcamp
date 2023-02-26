package POM_WORDPRESS_BASE;


import POM_WORDPRESS_PAGE.WordPress_HomePage;
import POM_WORDPRESS_PAGE.WordPress_LogInPage;
import POM_WORDPRESS_PAGE.WordPress_ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public WordPress_HomePage wordpressHomepage;
    public WordPress_LogInPage wordpressLoginPage;
    public WordPress_ProfilePage wordpressProfilePage;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wordpressHomepage = new WordPress_HomePage(driver, wdwait);
        wordpressLoginPage = new WordPress_LogInPage(driver, wdwait);
        wordpressProfilePage = new WordPress_ProfilePage(driver, wdwait);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }
}
