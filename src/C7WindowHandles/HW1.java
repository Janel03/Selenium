package C7WindowHandles;
/*
**HomeWork 1****WindowHandles**
1.goto http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your username in form
Create your Google Account
Hint1:
u can save the window handle in variables for later use
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        String url = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       //save the mainpage in a var
        String mainPage=driver.getWindowHandle();
        //click on Help & Privacy buttons
        WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        Set<String> windowHandles=driver.getWindowHandles();
        for (String priv :windowHandles){
            WebDriver privacyTab = driver.switchTo().window(priv);
            driver.switchTo().window(priv);
        }
        //click on Community button
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
        //go to Gmail & enter your username
        driver.switchTo().window(mainPage);
        WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("Janel");


    }
}
