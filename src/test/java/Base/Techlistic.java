package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Techlistic {
    public static void main(String[] args) {
        techlistic();

    }

    public static void techlistic(){

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open required page
        driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");

        //get table
        List<WebElement> table = driver.findElements(By.cssSelector("tbody[style='box-sizing: inherit;'] tr td"));
        for (int i = 1; i <table.size() ; i++) {
            System.out.println(table.get(i).getText());
        }




        driver.close();



    }


}
