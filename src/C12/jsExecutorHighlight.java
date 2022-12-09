package C12;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.nio.file.WatchEvent;
import java.util.concurrent.TimeUnit;

public class jsExecutorHighlight {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // find the webEelment username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
//      using js Executor
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //make the admin block PINK :)
        js.executeScript("arguments[0].style.backgroundColor='pink'",username);
        //js.executeScript("arguments[0].style.border='10px dotted pink'",username);



    }
}
