package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/DataTable.html");

        String name = "Rohan Patil";


     //   WebElement delete = driver.findElement(By.xpath("//tr[td/strong[text()='Isha Sharma']]//button[@title='Delete']"));
        WebElement delete = driver.findElement(By.xpath("//tr[td/strong[text()='"+name+"']]//button[@title='Delete']"));

        Thread.sleep(4000);

        delete.click();
    }
}
