package JavaHunters.windowHandle;
/*
Explicit waits or WebDriver wait: WebDriverWait wait = new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
It is used to tell webDriver to wait for a certain or expected condition before throwing "ElementNotVisibleException".
Explicit wait works with ExceptedConditional class waits until the condition is met or the given time is achieved.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class explicitWaits {
    public static void main(String[] args) {
        String url="https://syntaxprojects.com/dynamic-elements-loading.php";
        System.setProperty("webdriver.chrome.driver","driverNew/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement startButton = driver.findElement(By.id("startButton"));//click on Start button
        startButton.click();
        //WebElement expectedOutput = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
    }
}
