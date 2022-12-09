package Review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        //check the Checkbox
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='checkbox']"));
        //click the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Remove']"));
        button.click();
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        //WebElement text=driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));//with ""
        System.out.println(text.getText());
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Enable']"));
        button2.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blabla");

    }
}
