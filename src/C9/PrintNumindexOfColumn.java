package C9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
//Dynamic Tables
public class PrintNumindexOfColumn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        //enter the username
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
       //enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //click on the login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        //check the checkbox that contains "Screensaver" as a product
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
    //traverse through the list
        for (int i = 0; i <secondColumn.size(); i++) {
            //System.out.println(secondColumn.get(i).getText());
            String columnText=secondColumn.get(i).getText();
            //check for the desired value
            if (columnText.equalsIgnoreCase("ScreenSaver")){//can change to MyMoney
                //if (columnText.equalsIgnoreCase("MyMoney")){
    //print out the index of the column with "Screensaver"
                System.out.println("The index of the row which contains the Screen Saver is: "+(i+1));
         //get the 2 ScreenSaver checkboxes & click on it
                ////table[@class='SampleTable']/tbody/tr[2]/td[1]
                ////table[@class='SampleTable']/tbody/tr[4]/td[1]
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
        checkBox.click();
            }
        }}}