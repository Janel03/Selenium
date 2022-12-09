package C7WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/*
1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
2. click on get New User
3. get the firstname  of user and print it on console

 */
public class HW2 {
    public static void main(String[] args) {
        String url = "https://syntaxprojects.com/dynamic-data-loading-demo.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on New user
        WebElement newUser = driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUser.click();
        //locate firstname
        WebElement firstName = driver.findElement(By.id("First-Name"));
        //get the first name
        WebElement nameOfFirstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String printName=nameOfFirstName.getText();
        System.out.println(printName);

    }
}
