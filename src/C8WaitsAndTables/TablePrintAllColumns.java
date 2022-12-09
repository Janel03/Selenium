package C8WaitsAndTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class TablePrintAllColumns {
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

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column:columns) {
            String columnText= column.getText();
            System.out.println(columnText);
            System.out.println("----------------------");
        }
    }
}
/*//table[@id='customers']/tbody/tr[3]/td[2]
xpath for a specific row & column
*/
