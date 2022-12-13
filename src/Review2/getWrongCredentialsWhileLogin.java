package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWrongCredentialsWhileLogin {
    public static void main(String[] args) throws InterruptedException {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","driverNew/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the fb.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //when sends in the username admin
        WebElement userName=driver.findElement(By.id("txtUsername"));
        //send the username
        userName.sendKeys("Admin");
        //then user sends in the wrong password
        WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("balabacdl");
        Thread.sleep(2000);
        //then user clicks on login
        WebElement btn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();
        //then verify that the error "invalid credentials" is displayed
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error=errorMSG.getText();
        //verification
        if (error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("the correct error message is there > verified");
        }else{
            System.out.println("the correct Error message is not there");
        }

    }
}
