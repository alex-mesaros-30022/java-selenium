import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://selenium_driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com");


        //Absolute Xpath
       // driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("sth");
       // driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

        //Relative Xpath


        //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("t-shirts");
        //driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        //or
        //driver.findElement(By.xpath("//input[@id='gha-ac' or @name='_nkw']")).sendKeys("T-shirts");
        //driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        //contains
        //driver.findElement(By.xpath("//input[contains(@id,'g')]")).sendKeys("shirts");

        //starts-with
        //driver.findElement(By.xpath("//input[starts-with(@id, 'gh-b')] ")).click();

        //text
        //driver.findElement(By.xpath("//a[text() = 'My eBay']")).click();
        driver.findElement(By.xpath("//a[text() = 'Sell']")).click();




    }
}
