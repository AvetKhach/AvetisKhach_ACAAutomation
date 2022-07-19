package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumBase {
    public static void main(String[] args) throws InterruptedException {
        amazonTest();
    }
    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        String title =  driver.getTitle();
        System.out.println(title);
        //find the search field
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        //input into field
        searchField.sendKeys("macbook");
        //search button
        WebElement searchButton = driver.findElement(By.cssSelector("[id='nav-search-submit-button']"));
        //click button
        searchButton.click();
        //find macbooks
        List<WebElement> searchMacBooks = driver.findElements(By.cssSelector("[class='sg-row']"));
        for (int i = 0; i < searchMacBooks.size(); i++) {
            if (searchMacBooks.get(i).getText().contains("1,199")){
                System.out.println("Great  "+searchMacBooks.get(i).getText());
                break;
            }
        }
        System.out.println("BAD");

        driver.close();


    }
}
