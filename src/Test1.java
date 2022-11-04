import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D://selenium_driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://money.rediff.com/gainers");

        driver.manage().window().maximize();

        //xpath axes dynamic (the data keeps on changing daily)

        //xpath self node
        //driver.findElement(By.xpath("//a[contains(.,'Olatech Solutions')]/self::a")).click();

        //parent node
        //driver.findElement(By.xpath("//a[contains(.,'Olatech Solutions')]/parent::td")).getText();

        //child node

        //System.out.println(driver.findElement(By.xpath("//a[contains(.,'Olatech Solutions')]/child::*"));

        //node's childs
        List<WebElement> webElements = driver.findElements(By.xpath("//a[contains(.,'Olatech Solutions')]/ancestor::tr/child::*"));
        System.out.println(webElements.size());

        //ancestor node
        String ancestorNode = driver.findElement(By.xpath("//a[contains(.,'Olatech Solutions')]/ancestor::tr")).getText();
        System.out.println("Ancestor node:" + ancestorNode);

        //following
        List<WebElement> webElement1 = driver.findElements(By.xpath("//a[contains(.,'Olatech Solutions')]/following::*"));
        System.out.println("Number of following elements:" + webElement1.size());

        //following-sibling
        List<WebElement> webElement2 = driver.findElements(By.xpath("//a[contains(.,'Olatech Solutions')]/ancestor::tr/following-sibling::*"));
        System.out.println("Number of following-sibling elements:" + webElement2.size());

        //preceding
        List<WebElement> webElement3 = driver.findElements(By.xpath("//a[contains(.,'Olatech Solutions')]/preceding::*"));
        System.out.println("Number of preceding elements:" + webElement3.size());

        //preceding-siblings
        List<WebElement> webElement4 = driver.findElements(By.xpath("//a[contains(.,'Olatech Solutions')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("Number of preceding-siblings:" + webElement4.size());

        driver.close();


    }
}
