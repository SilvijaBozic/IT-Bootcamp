package Herokuapp_Base;

import Herokuapp_Page.LogIn_Page;
import Herokuapp_Page.LogOut_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class Base {

    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;
    public LogIn_Page logIn_page;
    public LogOut_Page logOut_page;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\Administrator\\Desktop\\Herokuapp.xlxs");
        homeURL = excelReader.getStringData("URL", 1, 0);
        logIn_page = new LogIn_Page(driver, wdwait);
        logOut_page = new LogOut_Page(driver, wdwait);
        }
   // @AfterClass
   // public void tearDown(){

   // }

}
