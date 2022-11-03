import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }
}
