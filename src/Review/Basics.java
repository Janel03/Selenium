package Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //create an instance
        WebDriver driver=new ChromeDriver();
        //open FB
        driver.get("https://www.facebook.com/");//get - just opens, not flexible. navigate - can go back or forward
        //get waits for website to open fully, navigate doesn't
        //maximize the window
        driver.manage().window().maximize();
        //click on create new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //bring .sleep > otherwise will give error
        Thread.sleep(3000);
        //fill in firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jane");
        //lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
        //close the window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();







        //before closing wait
       // Thread.sleep(5000);
        //quite the browser
       // driver.quit();

    }
}
