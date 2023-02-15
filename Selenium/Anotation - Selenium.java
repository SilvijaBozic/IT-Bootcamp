package Domaci_SB_12_01_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ZadatakSB_13_01_2023 {

    //Prethodni zadatak za dodavanje knjiga uraditi koristeci Anotacije.
    // Da jedan test bude sa dodavanjem jedne knjige,
    // drugi test sa dodavanjem dve knjige.

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");
    }


    @Test
    public void UserCanLogInWithCookiesAddTwoBooks() throws InterruptedException {
            Cookie cookieID = new Cookie("userID", "15e5ec14-01c4-4256-a8e3-187224a09a0d");
            Cookie cookieExpires = new Cookie("expires", "2023-01-22T15%3A43%3A27.418Z");
            Cookie cookieToken = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik1hamFNIiwicGFzc3dvcmQiOiJTaWx2aWphYm96aWMxNi8qIiwiaWF0IjoxNjczNzk3NDA3fQ.FnkOyi1AEwmzKvdDzm6Iw38gwWADSZ2VBsgoUM1cMZA");
            Cookie cookieUserName = new Cookie ("userName", "MajaM");
            driver.manage().addCookie(cookieID);
            driver.manage().addCookie(cookieExpires);
            driver.manage().addCookie(cookieUserName);
            driver.manage().addCookie(cookieToken);
            driver.navigate().refresh();
       WebElement usernameField = driver.findElement(By.id("userName"));
        usernameField.sendKeys("MajaMajic");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Silvijabozic16/*");
        WebElement clickOnLogInButton = driver.findElement(By.id("login"));
        clickOnLogInButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", ""); //neće da mi radi scroll

        Thread.sleep(5000);
        List<WebElement> bookStoreButton = driver.findElements(By.id("item-2"));
        bookStoreButton.get(4).click();
        Thread.sleep(3000);
        WebElement book1 = driver.findElement(By.id("see-book-Git Pocket Guide"));
        book1.click();
        JavascriptExecutor jse1 = (JavascriptExecutor) driver; //praviš objekat
        jse1.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        Thread.sleep(3000);
        List <WebElement> addToYourCollectionButton = driver.findElements(By.id("addNewRecordButton"));
        addToYourCollectionButton.get(1).click();
        driver.navigate().back();
        WebElement book2 = driver.findElement(By.id("see-book-Learning JavaScript Design Patterns"));
        book2.click();
        Thread.sleep(3000);
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        List <WebElement> addToYourCollectionButton1 = driver.findElements(By.id("addNewRecordButton"));
        addToYourCollectionButton1.get(1).click();
        driver.navigate().back();
        JavascriptExecutor jse3 = (JavascriptExecutor) driver;
        jse3.executeScript("window.scrollBy(0,350)", "");

        List <WebElement> profileButton = driver.findElements(By.id("item-3"));
        profileButton.get(4).click();

        Thread.sleep(6000);
        //napravila si listu knjiga koje imaju id mr-2 i to su one 2 knjige koje su ti u korpi
        List <WebElement> books = driver.findElements(By.className("mr-2"));
        System.out.println(books);
        System.out.println("Na stanju su "+books.size()+" knjige.");
        int booksNumber = books.size();
        Assert.assertEquals(booksNumber, 2);

        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        WebElement loginLink = driver.findElement(By.linkText("login"));
        loginLink.click();
        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("MajaM");
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("Silvijabozic16/*");
        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();

        Thread.sleep(3000);
        List<WebElement> books1 = driver.findElements(By.className("mr-2"));
        System.out.println(books1);
        System.out.println("Na stanju su i dalje "+books1.size()+" knjige.");

        int booksNumber1 = books1.size();
        Assert.assertEquals(booksNumber1, 2);
    }

    @Test
    public void UserCanLogInWithCookiesAddThreeBooks() throws InterruptedException {
        Cookie cookieID = new Cookie("userID", "15e5ec14-01c4-4256-a8e3-187224a09a0d");
        Cookie cookieExpires = new Cookie("expires", "2023-01-22T15%3A43%3A27.418Z");
        Cookie cookieToken = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Ik1hamFNIiwicGFzc3dvcmQiOiJTaWx2aWphYm96aWMxNi8qIiwiaWF0IjoxNjczNzk3NDA3fQ.FnkOyi1AEwmzKvdDzm6Iw38gwWADSZ2VBsgoUM1cMZA");
        Cookie cookieUserName = new Cookie ("userName", "MajaM");
        driver.manage().addCookie(cookieID);
        driver.manage().addCookie(cookieExpires);
        driver.manage().addCookie(cookieUserName);
        driver.manage().addCookie(cookieToken);
        driver.navigate().refresh();
        WebElement usernameField = driver.findElement(By.id("userName"));
        usernameField.sendKeys("MajaMajic");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Silvijabozic16/*");
        WebElement clickOnLogInButton = driver.findElement(By.id("login"));
        clickOnLogInButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

        Thread.sleep(5000);
        List<WebElement> bookStoreButton = driver.findElements(By.id("item-2"));
        bookStoreButton.get(4).click();
        Thread.sleep(3000);
        WebElement book1 = driver.findElement(By.id("see-book-Git Pocket Guide"));
        book1.click();
        JavascriptExecutor jse1 = (JavascriptExecutor) driver; //praviš objekat
        jse1.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        Thread.sleep(3000);
        List <WebElement> addToYourCollectionButton = driver.findElements(By.id("addNewRecordButton"));
        addToYourCollectionButton.get(1).click();
        driver.navigate().back();
        WebElement book2 = driver.findElement(By.id("see-book-Learning JavaScript Design Patterns"));
        book2.click();
        Thread.sleep(3000);
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        List <WebElement> addToYourCollectionButton1 = driver.findElements(By.id("addNewRecordButton"));
        addToYourCollectionButton1.get(1).click();
        driver.navigate().back();
        WebElement book3 = driver.findElement(By.id("see-book-Eloquent JavaScript, Second Edition"));
        book3.click();
        Thread.sleep(3000);
        JavascriptExecutor jse3 = (JavascriptExecutor) driver;
        jse3.executeScript("window.scrollBy(0,350)", "");
        List <WebElement> addToYourCollectionButton2 = driver.findElements(By.id("addNewRecordButton"));
        addToYourCollectionButton2.get(1).click();
        driver.navigate().back();
        JavascriptExecutor jse4 = (JavascriptExecutor) driver;
        jse4.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

        List <WebElement> profileButton = driver.findElements(By.id("item-3"));
        profileButton.get(4).click();

        Thread.sleep(6000);
        //napravila si listu knjiga koje imaju id mr-2 i to su one 3 knjige koje su ti u korpi
        List <WebElement> books = driver.findElements(By.className("mr-2"));
        System.out.println(books);
        System.out.println("Na stanju su "+books.size()+" knjige.");
        int booksNumber = books.size();
        Assert.assertEquals(booksNumber, 3);

        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        WebElement loginLink = driver.findElement(By.linkText("login"));
        loginLink.click();
        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("MajaM");
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("Silvijabozic16/*");
        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();

        Thread.sleep(3000);
        List<WebElement> books1 = driver.findElements(By.className("mr-2"));
        System.out.println(books1);
        System.out.println("Na stanju su i dalje "+books1.size()+" knjige.");

        int booksNumber1 = books1.size();
        Assert.assertEquals(booksNumber1, 3);
    }
    }


