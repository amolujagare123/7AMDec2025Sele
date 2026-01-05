package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StockAppNameAndLinkText {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.in/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin");

        WebElement loginButton = driver.findElement(By.name("submit"));
        loginButton.click();

        WebElement addCustomerLink = driver.findElement(By.linkText("Add Customer"));
        addCustomerLink.click();

        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Selenium User");

        WebElement contact1 = driver.findElement(By.name("contact1"));
        contact1.sendKeys("9876543210");

        WebElement address = driver.findElement(By.name("address"));
        address.sendKeys("Pune Maharashtra");

        WebElement contact2 = driver.findElement(By.name("contact2"));
        contact2.sendKeys("9123456780");

        WebElement addButton = driver.findElement(By.name("Submit"));
        addButton.click();
    }
}
