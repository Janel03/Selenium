package C11;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotDemo {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//username text box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);
//enter the password
        WebElement passWord = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passWord.sendKeys("test", Keys.ENTER);
    //take screenshot
        TakesScreenshot ss=(TakesScreenshot)driver;
        //screenshot is taken
        File fileSS = ss.getScreenshotAs(OutputType.FILE);
        //destination will be saved in a folder creeated at run time
        FileUtils.copyFile(fileSS,new File("screenshots/SmartBear/adminLogin.png"));
        //will create another screenshot, cause changed the name in the name
        //FileUtils.copyFile(fileSS,new File("screenshots/SmartBear/adminLogin123.png"));
    }
}