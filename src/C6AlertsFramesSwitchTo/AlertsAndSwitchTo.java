package C6AlertsFramesSwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndSwitchTo {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntax project /checkbox demo
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        //find the alert btn & click on the alert button
        WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        simpleAlert.click();
        Thread.sleep(2000);
        //handling the alert=accept
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();
        //find the btn for confirmation alert & click on it
        WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmAlert.click();
        //cancel the confirm alert
        Alert confirmAlert1 = driver.switchTo().alert();
        confirmAlert1.dismiss();
        //find the prompt alert & send some text, then accept it
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();
        //switch the focus to the alert
        Alert prompt1 = driver.switchTo().alert();
        prompt1.sendKeys("bla bla");
        prompt1.accept();


    }
}