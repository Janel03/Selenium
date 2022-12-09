package C3Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).sendKeys("Jane Doe");
        driver.findElement(By.id("userEmail")).sendKeys("janedoe@email.com");
        driver.findElement(By.id("currentAddress")).sendKeys("123 Street, NY, USA");
        driver.findElement(By.id("permanentAddress")).sendKeys("123 Street, NY, USA");
        Thread.sleep(1000);//didn't work without sleep the first time
        driver.findElement(By.id("submit")).click();
    }
}
