package JavaHunters.windowHandle;
/*
Implicit wait tells your webDriver wait for a certain amount of time before throwing a "No such Element exception".
Implicit wait is written only once and will be applied for the whole session/execution.
We can say Implicit wait is also called global wait.
Implicit wait is usually set to 20 seconds. If your element is located in 3 seconds the rest time will be ignored.
Your script will move on to the next action. It will be applied only for findElement() or findElements() method.
Syntax: driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchBetweenTabsandImplicitWaits {
    public static void main(String[] args) {
        //       setting up the webDriver
        String url = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement helpText = driver.findElement(By.xpath("//a[text()='Help']"));
        helpText.click();//opening the Help page
        String mainPage = driver.getWindowHandle();//assingning the parent page to be able to use later
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());//number of tabs opened
        //looping/iterating through all the tabs opened
        //gives the parent tab
        for (String helpPage : windowHandles) {
            driver.switchTo().window(helpPage);//will switch to Help page
            String title = driver.getTitle();
            System.out.println(title);
            if (title.equals("Google Account Help")) {
                System.out.println(title);
                driver.close();//will close child class
            }
            //driver.close();//to close everything
        }
        //driver.switchTo().window(mainPage);//go back to parent page
    }
}
