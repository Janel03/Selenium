package C3Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //create an instance
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        //maximize window
        driver.manage().window().maximize();
        //click on start practicing
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        //click on simple form demo > use and operator if the xpath is not unique to concatenate 2 paths
        Thread.sleep(2000);//without sleep didn't work
        //driver.findElement(By.xpath("//a[@class='list-group-item'and@href='basic-first-form-demo.php']")).click();
        //or use this
        driver.findElement(By.xpath("(//a[@class='list-group-item' ])[1]")).click();

    }
}
