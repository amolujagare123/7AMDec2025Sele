package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableDemo3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amolujagare.com/DataTables.html");

        String name = "ABC Technologies";


     //   WebElement delete = driver.findElement(By.xpath("//tr[td/strong[text()='Isha Sharma']]//button[@title='Delete']"));
        WebElement button = driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//button"));

        Thread.sleep(4000);


        //a[contains(text(),'Edit')]
        button.click();

        WebElement edit = driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']] //a[contains(text(),'Edit')]"));


    }
}
