package C8WaitsAndTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class PrintTheWholeTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //print the whole table on the console
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAT = allTable.getText();
        System.out.println(textAT);
    }
}