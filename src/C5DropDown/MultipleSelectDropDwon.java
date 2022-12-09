package C5DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDwon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to syntax.com radio button
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
//find the webelement that has select text
        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));
//use select class
        Select sel=new Select(DD);
        //by index
        sel.selectByIndex(3);
        //by visible text
        sel.selectByVisibleText("Texas");
        //deselect by index
        sel.deselectByIndex(3);
        //select all the options
        List<WebElement> allOprtions= sel.getOptions();
        for (int i = 0; i < allOprtions.size(); i++) {
            sel.selectByIndex(i);

        }
        Thread.sleep(3000);
        sel.deselectAll();

        //check if the dropdown is multi select or not using selenium
        boolean multiSelect=sel.isMultiple();
        System.out.println(multiSelect);
    }
}
