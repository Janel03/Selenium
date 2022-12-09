package C4CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to syntax.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //get the male radio button
        WebElement maleBtn= driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        //check if the radio btn is displayed
        boolean displayStatus=maleBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is displayed: "+displayStatus);
        //check if the radio button is enabled
        boolean enableStatus=maleBtn.isDisplayed();
        System.out.println("The radio button is enabled: "+enableStatus);
        //check if the radio button is selected
        boolean selectStatus=maleBtn.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);
        //check if radio button is not selected then click on it
        if(!selectStatus){
            //perform a click operation
            maleBtn.click();
        }
        selectStatus=maleBtn.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);

    }
}
