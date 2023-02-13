package DomaciZadatak_Selenium_SB_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ZadatakJedan {
    public static void main(String[] args) throws InterruptedException {
        //Otici na YouTube preko Google-a i pustiti pesmu po Vasem izboru.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("http://www.google.com");
        WebElement googleInput = driver.findElement(By.name("q"));
        googleInput.sendKeys("http://www.youtube.com");
        googleInput.sendKeys(Keys.ENTER);

        //TimeUnit.SECONDS.sleep(1);
        WebElement clickOnYouTube = driver.findElement(By.xpath("/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        clickOnYouTube.click();
        TimeUnit.SECONDS.sleep(1);

        WebElement typeInSearchBarYoutube = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
        typeInSearchBarYoutube.click();
        typeInSearchBarYoutube.sendKeys("i will always love you");
        typeInSearchBarYoutube.sendKeys(Keys.ENTER);
        TimeUnit.SECONDS.sleep(1);

        WebElement clickOnSong = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img"));
        clickOnSong.click();

    }
}
