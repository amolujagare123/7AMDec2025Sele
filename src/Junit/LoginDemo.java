package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername2 = driver.findElement(By.id("login-username"));
        txtUsername2.sendKeys("dfdfdf");

        WebElement txtPassword2 = driver.findElement(By.id("login-password"));
        txtPassword2.sendKeys("admin");

        WebElement btnLogin2 = driver.findElement(By.name("submit"));
        btnLogin2.click();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername3 = driver.findElement(By.id("login-username"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver.findElement(By.id("login-password"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver.findElement(By.name("submit"));
        btnLogin3.click();

    }
}
