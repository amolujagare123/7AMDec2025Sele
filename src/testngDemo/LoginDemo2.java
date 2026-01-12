package testngDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginDemo2 {
    WebDriver driver;

    @BeforeMethod // method below this annotation will run before every test method
    public  void  openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod  // method below this annotation will run after every test method
    public void close() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


    @Test
    public  void loginTest1() {

        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public  void loginTest2() {

        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("34343");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("343");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public  void loginTest3() {

        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }
}
