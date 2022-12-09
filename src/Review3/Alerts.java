package Review3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open this websit
        driver.get("https://demoqa.com/alerts");
        //click on the alert button Click me
        WebElement clickMe1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickMe1.click();
        //alert interface
        Alert alertForAll = driver.switchTo().alert();
        Thread.sleep(1000);
        alertForAll.accept();
//click on last alert & send a text
        WebElement clickMe4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        clickMe4.click();
//send text to the above alert by using already initialized alert1
        Thread.sleep(1000);
        alertForAll.sendKeys("blalala");
        alertForAll.accept();

    }
}
