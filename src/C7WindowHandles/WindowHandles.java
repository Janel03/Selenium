package C7WindowHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to Gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        //get the window handle
        String gmailHandle = driver.getWindowHandle();
        //print on console = will be different everytime > it's dynamic
        System.out.println("the handle of the current page is: "+gmailHandle);


    }
}