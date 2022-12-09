package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFacabook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver face=new ChromeDriver();
        face.get("https://facebook.com/");
        Thread.sleep(2000);
        face.findElement(By.id("email")).sendKeys("janel@gmail.com");
        face.findElement(By.id("pass")).sendKeys("janel123");
        face.findElement(By.name("login")).click();
    }}
