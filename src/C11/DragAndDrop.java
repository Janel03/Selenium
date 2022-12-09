package C11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        //switch the focus to from
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        //drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action=new Actions(driver);
        //action.dragAndDrop(draggable,dropLocation).perform();
        //same action as above
        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();

    }
}
