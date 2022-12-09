package C2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */

public class BankHW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver paraBank=new ChromeDriver();
        paraBank.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        paraBank.manage().window().maximize();

        paraBank.findElement(By.id("customer.firstName")).sendKeys("myName");
        paraBank.findElement(By.name("customer.lastName")).sendKeys("myLastName");
        paraBank.findElement(By.id("customer.address.street")).sendKeys("Street 123");
        paraBank.findElement(By.id("customer.address.city")).sendKeys("myCity");
        paraBank.findElement(By.id("customer.address.state")).sendKeys("myState");
        paraBank.findElement(By.id("customer.address.zipCode")).sendKeys("myZip00011");
        paraBank.findElement(By.id("customer.phoneNumber")).sendKeys("0123456789");
        paraBank.findElement(By.name("customer.ssn")).sendKeys("012664999");
        paraBank.findElement(By.id("customer.username")).sendKeys("myUsername");
        paraBank.findElement(By.id("customer.password")).sendKeys("myPassword123");
        paraBank.findElement(By.name("repeatedPassword")).sendKeys("myPassword123");
        paraBank.findElement(By.className("button")).click();

        Thread.sleep(2000);
        paraBank.quit();
    }


}
