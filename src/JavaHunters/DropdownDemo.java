package JavaHunters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
    public static void main(String[] args) throws InterruptedException {
        String url="http://syntaxprojects.com/basic-select-dropdown-demo.php";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement selectDrop=driver.findElement(By.xpath("//select[@id='select-demo']"));
        selectDrop.click();
        Select select=new Select(selectDrop);
        for (int i=1; i<=7;i++){//to select each day - use for loop
            select.selectByIndex(i);
            String text=selectDrop.getText();//if I add this will print on my console all the days
            System.out.println(text);
            Thread.sleep(1000);
        }
        //select.selectByVisibleText("Friday");
        driver.quit();
    }
}
