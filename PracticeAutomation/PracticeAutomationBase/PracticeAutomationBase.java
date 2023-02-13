package PracticeAutomationBase;

import PracticeAutomationPages.PracticeAutomationLogInPage;
import PracticeAutomationPages.PracticeAutomationPracticePage;
import PracticeAutomationPages.PracticeAutomationProfilePage;
import PracticeAutomationPages.PracticeAutomationSideBarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class PracticeAutomationBase {
    //BaseTest klasa mi sluzi da smestim sve pocetne i krajnje metode uz pomocne metode koje cu koristiti u
    //testovima. Npr. metoda za cekanje, metoda za scroll...
    //1. Inicijalizujem driver i wdwait na pocetku van svih metoda. Moraju biti public kako bih ih video
    //u test klasi
    public WebDriver driver;
    public WebDriverWait wdwait;

    //10. Svaku page stranicu moram da deklarisem van metoda
    public PracticeAutomationSideBarPage practiceAutomationSideBarPage;
    public PracticeAutomationPracticePage practiceAutomationPracticePage;
    public PracticeAutomationLogInPage practiceAutomationLogInPage;
    public PracticeAutomationProfilePage practiceAutomationProfilePage;

    //2. Kreiram metodu setUp sa anotacijom BeforeClass jer zelim da se izvrsi samo jednom na pocetku
    //U toj metodi cu da inicijalizujem driver i wdwait
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //11. Svaku page stranicu inicijalizujem u setUp metodi i prosledjujem driver i wdwait
        //-> preci na test klasu (LoginTest)
        practiceAutomationSideBarPage = new PracticeAutomationSideBarPage(driver, wdwait);
        practiceAutomationPracticePage = new PracticeAutomationPracticePage(driver, wdwait);
        practiceAutomationLogInPage = new PracticeAutomationLogInPage(driver, wdwait);
        practiceAutomationProfilePage = new PracticeAutomationProfilePage(driver, wdwait);

    }

    //3. Kreiram metodu tearDown sa anotacijom AfterClass jer zelim na samom kraju da mi se obavi neka akcija
    @AfterClass
    public void tearDown() {
        //driver.quit();
        //Dok pravim testove zakomentarisacu driver.quit() jer zelim da mi ostane otvoren prozor tokom testa
        //ako padne iz nekog razloga ili da proverim da li je sve kako treba
        //Tek kad zavrsim posao onda cu otvoriti driver.quit()
    }

    //Za svaku stranicu moram da kreiram posebnu klasu gde cu smestiti sve webelemente te stranice
    //Ako imam deo aplikacije koji se ponavlja na svakoj ili na vise razlicitih stranica
    //onda za taj deo cu napraviti posebnu klasu i to je prva klasa koju pravim nakon BaseTest
    //->pogledati klasu PracticeSidebarPage
}

