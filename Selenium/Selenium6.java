package SeleniumUvod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {
    public static void main(String[] args) {
        //adding cookies
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
        //kreiramo objekat cookie kojem dodeljujemo ime i vrednost
        Cookie cookie = new Cookie("wordpress_logged_in", "lovematch095%7C1768741761%7CCJHT74KY6DJsM3sjw88FLTcRaCdglEYFtLWeFTXFclw%7C10e469d631c1d633e519bcded303600d52b1a1f6e235eb63697716ac090cc22a");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();


    }
}
