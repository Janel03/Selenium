package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
/*
go to google.com
go to fb.com
go back to google
 */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");// go to google > get() opens the website

        driver.navigate().to("https://www.facebook.com/");//will go to fb after google

        //introduce sleep > to wait, so that it doesn't open & close so quickly
        Thread.sleep(2000);//pause for 2 secs
        /* like clicking the back button, will go back to google */
        driver.navigate().back();
        //wait for 2 secs
        Thread.sleep(2000);
        //go back to fb.com
        driver.navigate().forward();
        //refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.quit();

    }
}
