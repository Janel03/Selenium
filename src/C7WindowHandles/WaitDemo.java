package C7WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to Gmail sign up page
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();
        //find the text
        WebElement welcomeTxt = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=welcomeTxt.getText();
        System.out.println("the text is: "+text);

    }
}