
package testngDemo.realDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSitesTestEngine {

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
    public void naukri() {
        driver.get("https://www.naukri.com");
        Assert.assertEquals(driver.getTitle(),"Naukri.com",
                "This is not a naukri site");
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
    }

    @Test
    public void monster() {
        driver.get("https://www.monster.com");
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
    }
}
