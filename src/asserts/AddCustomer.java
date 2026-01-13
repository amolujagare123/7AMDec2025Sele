package asserts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer {




    @Test
    public  void addCustomer() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Navnath");
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("545454");
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("5454545");

        driver.findElement(By.xpath("//input[@value='Add']")).click();



        String expected = "Dublicat Entry. Please Verify" ;
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();

        }
        catch ( Exception c)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");

    }


    @Test
    public  void addCustomer2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        String name = "Navnath5";

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("545454");
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("5454545");

        driver.findElement(By.xpath("//input[@value='Add']")).click();



        String expected = "[ "+name+" ] Customer Details Added !" ;
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();

        }
        catch ( Exception c)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no message");

    }

    @Test
    public  void addCustomer3() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        String name = "Navnath6";

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='buyingrate']")).sendKeys("545454");
        driver.findElement(By.xpath("//input[@id='sellingrate']")).sendKeys("5454545");

        driver.findElement(By.xpath("//input[@value='Add']")).click();



        String expected = "Customer Details Added" ;
        String actual = "";
        boolean result = false ;
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();

            result = actual.contains(expected);
        }
        catch ( Exception c)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertTrue(result,"incorrect or no message");

    }
}
