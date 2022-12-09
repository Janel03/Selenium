package C3Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //go to fb.com
        driver.get("https://www.facebook.com/");
        //enter username > 1. xpath by @
        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");//xpath

        //click on forgot password > 2. xpath by text
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //3. xpath with Contains method > by partial value
        //driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();//long attribute value
        //driver.findElement((By.xpath("//button[contains(@type,'sub')]"))).click();

        //4. xpath Starts with
        driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("pass123");
    }
}
