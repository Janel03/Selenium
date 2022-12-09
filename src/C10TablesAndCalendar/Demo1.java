package C10TablesAndCalendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //open this website
        driver.get("https://www.delta.com/");
        //       click on the calander
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();
//        get the month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));

        boolean isFound=false;
        while (!isFound) {
            String monthText = month.getText();
            if (monthText.equalsIgnoreCase("March")) {
                List<WebElement> Dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for(WebElement date:Dates){
                    String currentDate = date.getText();
                    if(currentDate.equalsIgnoreCase("20")){
                        date.click();
                        break;
                    }}
                isFound=true;
            }
            else {
                nextBtn.click();
            }}}}