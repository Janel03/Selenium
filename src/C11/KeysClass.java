package C11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class KeysClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//username text box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
    userName.sendKeys("Tester", Keys.TAB);
//enter the password
    WebElement passWord= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
    passWord.sendKeys("test",Keys.ENTER);

    }
}