package C2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();//set instance
        //go to fb.com
        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //enter the username in the TextBOX
        //1. locate the element & send the keys
        driver.findElement(By.id("email")).sendKeys("salta@gmail.com");
        //enter the password in the TextBox
        driver.findElement(By.id("pass")).sendKeys("asdj123");
        //click the login
        driver.findElement(By.name("login")).click();

        //

        //task 2 > click on forgot password using linkText locator
       // driver.findElement(By.linkText("Forgot password?")).click();

        //task 3 > click on forgot password using Partial link Text locator
        //driver.findElement(By.partialLinkText("Forgot ")).click();


    }
}
