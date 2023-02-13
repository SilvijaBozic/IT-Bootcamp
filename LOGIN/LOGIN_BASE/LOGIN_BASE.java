package LOGIN_BASE;

import LOGIN_PAGE.HomePage;
import LOGIN_PAGE.LogOut;
import LOGIN_PAGE.PracticeTestLogIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class LOGIN_BASE {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homeURL;

    public HomePage homePage;
    public PracticeTestLogIn practiceTestLogIn;
    public LogOut logOut;

    // zelimo da testiramo koristeci DDT ( DATA DRIVEN TESTS METODU)
    //To je metoda preko koje mozemo sve podatke sa kojima cemo
    // raditi da smestimo u excel i potom iz programa u kojem radimo mozemo pozvati te podatke
    //Kreiraces klasu excel reader
    @BeforeClass
    public void setUp () throws IOException {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //kada smo kreirali excel klasu i definisali je kreiramo
    // i objekat u kojem definisemo string path(lokaciju excel dokumenta)
    excelReader = new ExcelReader("C:\\Users\\Administrator\\Desktop\\LOGIN.xlsx");
    //kreirali smo excel reader i mozemo izvlaciti podatke iz njega
    homeURL = excelReader.getStringData("URL", 1, 0); // prosledjujemo integer vrednosti ne string?
    }
    @AfterClass
    public void tearDown() {
    }

}
