package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        //set path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //create WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open the required website
        driver.get("https://www.google.com/");
        //get the url of the website
        String url=driver.getCurrentUrl();//return type is String
        //print the url
        System.out.println(url);

        //get the title
        String title=driver.getTitle();
        System.out.println(title);
        //close the chrome
        driver.quit();// will quit the whole browser
        //driver.close(); > it will close current tab only



    }}
