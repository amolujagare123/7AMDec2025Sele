package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo3 {

    public static void main(String[] args) throws InterruptedException {

       // WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");






    }
}
