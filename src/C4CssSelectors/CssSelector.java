package C4CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
            //driver.findElement(By.cssSelector("input[placeholder*='Please enter ']")).sendKeys("bla-bla-bla");

            //another method of doing the above
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder*='Please enter ']"));
        textBox.sendKeys("bla-bla-bla");

        //click the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
        button.click();
    }

}
