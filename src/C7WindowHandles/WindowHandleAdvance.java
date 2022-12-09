package C7WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowHandleAdvance {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //go to Gmail sign up page
            driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
            //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        //the title of my desired page is Google Help
        //get all the window handle
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle:allHandles){
            //switch the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the title of the window to which drver has switched
            String title = driver.getTitle();
            //compare the title of the privacy page
            if (title.equalsIgnoreCase("Google account Help")){
                System.out.println("the current page is: "+title);
                break;
            }
        }
        //find the community button & click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();
    }
}
