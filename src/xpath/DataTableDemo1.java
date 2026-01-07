package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableDemo1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/DataTable.html");

        String email = "kabir.joshi@mail.com";

      //  WebElement edit = driver.findElement(By.xpath("//tr[td[text()='isha.sharma@mail.com'] ] //button[@title='Edit']"));

        WebElement edit = driver.findElement(By.xpath("//tr[td[text()='"+email+"'] ] //button[@title='Edit']"));

        Thread.sleep(4000);

        edit.click();
    }
}
