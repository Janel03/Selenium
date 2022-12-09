package C2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to fb.com
click on create new account
fill up all the textboxes
close the pop-up
close the browser
 */
public class FbHW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver fb=new ChromeDriver();
        fb.get("https://www.facebook.com/");
        fb.manage().window().maximize();
        fb.findElement(By.partialLinkText("new account")).click();
        fb.findElement(By.name("firstname")).sendKeys("Jane");
        fb.findElement(By.name("lastname")).sendKeys("Doe");
        fb.findElement(By.id("u_b_g_jC")).sendKeys("0123456789");
        fb.findElement(By.name("birthday_month")).sendKeys("May");
        fb.findElement(By.name("birthday_date")).sendKeys("01");
        fb.findElement(By.name("birthday_year")).sendKeys("2000");
        fb.findElement(By.className("_58mt")).click();
        fb.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        fb.quit();




    }

}
