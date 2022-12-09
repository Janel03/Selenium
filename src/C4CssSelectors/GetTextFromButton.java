package C4CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to syntax.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //find the webelement button
       WebElement bTn= driver.findElement(By.cssSelector("button#buttoncheck"));
       //get th text from btn
        String text=bTn.getText();
        //print on console
        System.out.println("the text in the button is: "+text);
        //get the value of the attribute id from this webElement
        String idValue=bTn.getAttribute("id");
        System.out.println("The value of attribute id is: "+idValue);
    }
}
