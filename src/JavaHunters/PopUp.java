package JavaHunters;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
    public static void main(String[] args) throws InterruptedException {
        String url="http://syntaxprojects.com/javascript-alert-box-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement clickMeButton=driver.findElement(By.xpath("//button[text()='Click me!']"));
        clickMeButton.click();
        Thread.sleep(2000);
        Alert popUp=driver.switchTo().alert();
        popUp.accept();
        WebElement promtBox=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        promtBox.click();
        Thread.sleep(1000);
        Alert promptAlertCancel=driver.switchTo().alert();
        promptAlertCancel.dismiss();
        promtBox.click();
        Thread.sleep(900);
        Alert promptCancel=driver.switchTo().alert();
        Thread.sleep(1000);
        promptCancel.sendKeys("Janel");//didn't work
        promptCancel.accept();
    }
}
