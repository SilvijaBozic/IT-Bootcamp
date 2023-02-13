package SaucedemoBase;

import Herokuapp_Base.ExcelReader;
import SaucedemoPages.HomePage;
import SaucedemoPages.InventoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class Base {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public ExcelReader excelReader;
    public String homeURL;
    public HomePage homePage;
    public InventoryPage inventoryPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\Administrator\\Desktop\\saucedemo.xlsx");
        homeURL = excelReader.getStringData("URL", 1, 0);
        homePage = new HomePage(driver, wdwait);
        inventoryPage = new InventoryPage(driver, wdwait);
    }

    @AfterClass
    public void tearDown(){

    }
}
