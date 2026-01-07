import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/ ");

        List<WebElement> wbList = driver.findElements(By.tagName("a"));

        System.out.println("links count="+wbList.size());


        for (WebElement element : wbList)
            System.out.println(element.getText());


    }


}
