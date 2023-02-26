package Internet_Herokuapp_Base;

import Internet_Herokuapp_Pages.HomePage;
import Internet_Herokuapp_Pages.KeyPressesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Herokuapp_Base {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public KeyPressesPage keyPressesPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wdwait);
        keyPressesPage = new KeyPressesPage(driver, wdwait);
    }
    @AfterClass
    public void tearDown(){
        //driver.quit;
    }
}
