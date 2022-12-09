package C8WaitsAndTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
//implicit waits, waits only until the webelement is found
public class WaitsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    //click on the "change text to selenium webdriver"
        WebElement button1=driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();
        //get the text Selenium Webdriver
        WebElement wDtext = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
       //print the text on console
        System.out.println(wDtext.getText());

        //Task 2. need Explicit waits for this
        //click on the button "Display button after 10 seconds"
        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();
        //as the button appears after sometime, to be able to get a text from it,
        //need explicit wait
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();

    }
}
