package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        /*
        1. launch the browser
        2.navigate to amazon website
        3. print out the title and the url in the console.
*/
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver web=new ChromeDriver();
        web.get("https://www.amazon.com/");
        web.navigate().to("https://google.com");
        web.navigate().back();
        web.navigate().forward();
        web.navigate().refresh();
        String title=web.getTitle();
        if(title.equals("google")){
            System.out.println("match");
        }
        else{
            System.out.println("no match");
        }
        System.out.println(title);
        String url=web.getCurrentUrl();
        System.out.println(url);
    }
}




