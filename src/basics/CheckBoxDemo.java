package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.in/amol.html");


        WebElement javaCheckbox = driver.findElement(By.id("check0"));
        WebElement seleniumCheckbox = driver.findElement(By.id("check1"));
        WebElement cucumberCheckbox = driver.findElement(By.id("check2"));

        Thread.sleep(4000);

        if (javaCheckbox.isSelected())
            javaCheckbox.click();

        if (seleniumCheckbox.isSelected())
            seleniumCheckbox.click();

        if (cucumberCheckbox.isSelected())
            cucumberCheckbox.click();

    }
}
