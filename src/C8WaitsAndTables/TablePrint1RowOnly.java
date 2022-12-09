package C8WaitsAndTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePrint1RowOnly {
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
        //System.out.println(textAT);
        //print only Google row
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody//tr"));
        for (WebElement row:rows) {
            String rowText = row.getText();
        if (rowText.contains("Google")){
        System.out.println(rowText);
    }
        }
    }
}
