package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebayHW {
    public static void main(String[] args) throws InterruptedException {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the fb.com
        driver.get("https://www.ebay.com/");
        //select dropdown
        WebElement dropDwon=driver.findElement(By.xpath("//select[@class='gh-sb ']"));
        Select sel=new Select(dropDwon);
        //select by value
        sel.selectByValue("58058");
        //by type
        driver.findElement(By.xpath("//input[@type='submit']"));
        //verify the title
        /*WebElement title=*/driver.findElement(By.xpath("//title"));
        //driver.getTitle();
        //String titleText=title.getText();
        String title=driver.getTitle();
        if (title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("title is verified");
        }else{
            System.out.println("title is incorrect");
        }

}}
