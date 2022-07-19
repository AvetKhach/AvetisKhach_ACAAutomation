package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticePage {


    public static void main(String[] args) throws InterruptedException {
    practicePage();
    }


    public static void practicePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to practice page
        driver.navigate().to("https://courses.letskodeit.com/practice");

        //find bmw radiobutton
        WebElement radioButton = driver.findElement(By.id("bmwradio"));
        radioButton.click();

        //find honda checkbox
        WebElement checkbox =driver.findElement(By.cssSelector("[value='honda'][type='checkbox']"));
        checkbox.click();

        //find enable and disable button, print enabled/disabled
        WebElement enableButton = driver.findElement(By.id("enabled-button"));
        enableButton.click();
        System.out.println("ENABLED");

        WebElement disableButton = driver.findElement(By.cssSelector("[value='Disable']"));
        disableButton.click();
        System.out.println("DISABLED");

//        System.out.println(driver.findElement(By.cssSelector("value='Disable'")).getText());
//        driver.findElement(By.cssSelector("value='Disable'")).click();
//        System.out.println(driver.findElement(By.id("[id='enabled-button']")).getText());

        //find and click support button
        List<WebElement> supportButtons = driver.findElements(By.linkText("SUPPORT"));
        for (int i = 0; i <supportButtons.size() ; i++) {
            WebElement supportButton = supportButtons.get(i);
            supportButton.click();
            break;
        }

        //autofill name and email fields
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Avetis");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("avetis@synopsys.com");

        //autofill message field
        WebElement message = driver.findElement(By.name("message"));
        message.sendKeys("It's my first automation project.");

        //find and click submit button
        WebElement submit = driver.findElement(By.cssSelector("[value='Submit']"));
        submit.click();

        Thread.sleep(10000);
        driver.close();

    }
}
