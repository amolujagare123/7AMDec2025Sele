
package testngDemo.realDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSitesTestEngine {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void w3schools() {
        driver.get("https://www.w3schools.com");
    }

    @Test
    public void tutorialspoint() {
        driver.get("https://www.tutorialspoint.com");
    }

    @Test
    public void geeksforgeeks() {
        driver.get("https://www.geeksforgeeks.org");
    }

    @Test
    public void udemy() {
        driver.get("https://www.udemy.com");
    }
}
