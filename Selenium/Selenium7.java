package SeleniumUvod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.time.Duration;
import java.util.List;


public class Selenium7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //IMAGE UPLOAD

       /* driver.get("https://crop-circle.imageonline.co/#circlecropresult");
        WebElement picture = driver.findElement(By.id("inputImage"));
        picture.sendKeys("C:\\Users\\Administrator\\Desktop\\cat.jpg");*/

        //primer

        driver.get("https://imgflip.com/memegenerator");
        WebElement uploadNewTemplate = driver.findElement(By.id("mm-show-upload"));
        uploadNewTemplate.click();
        Thread.sleep(3000);
        WebElement uploadFromDevice = driver.findElement(By.id("mm-upload-file"));
        uploadFromDevice.click();
        Thread.sleep(3000);
        WebElement upload2 = driver.findElement(By.className("hidden-file-input"));
        upload2.click();
        upload2.sendKeys("C:\\Users\\Administrator\\Desktop\\slika.png");
        // probala sam da uploadujem ali ne znam, a online ne prihvata slike jer ne odgovara format

        //make a picture, download it and post it on slack
        Thread.sleep(3000);

        List <  WebElement> textBox = driver.findElements(By.className("mm-text"));
        textBox.get(0).sendKeys("UDJI SLOBODNO");

        WebElement generateMeme = driver.findElement(By.cssSelector(".mm-generate.b.but"));
        generateMeme.click();

        //---------------------------------------------------------------------------------
        //SAVE IMAGE
        WebElement meme = driver.findElement(By.id("done-img"));
        webDriverWait.until(ExpectedConditions.attributeContains(meme, "src", "imgflip.com"));
        String link = meme.getAttribute("src");
       // URL imageUrl = new URL (link);
       // BufferedImage saveImage = Image10.read(imageUrl);
       // Image10.wite(saveImage, "png", new File(ovde ti ide adresa tj lokacija
        // slike gde zelis da se postavi slika kad je skines));


    }
}
