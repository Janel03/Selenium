package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goog {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            String path="https://www.google.com/";
            driver.get(path);//another way to path than the one below
            // driver.get("https:www.google.com");
            String URL=driver.getCurrentUrl();
            System.out.println(path);
            System.out.println(URL);
            String title=driver.getTitle();
            if (path.equalsIgnoreCase(URL)){
                System.out.println("Match");
            }
            else{
                System.out.println("No match");
            }
            if (title.equalsIgnoreCase("Google")){
                System.out.println("Match");
            }
            else{
                System.out.println("No match");
            }
            driver.quit();



        /*System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();//opens & quits immediately*/
        }}

