package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {
    public static void main(String[] args) throws InterruptedException {
        //open google & maximize
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        //maximize . opens it max
       // driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();//takes over the whole screen > can only close by Esc

        Thread.sleep(2000);
        driver.quit();
    }}
