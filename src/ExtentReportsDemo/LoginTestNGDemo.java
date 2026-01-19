package ExtentReportsDemo;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReport.getBugScreenshot;

public class LoginTestNGDemo {
    ExtentReports extent;

    @BeforeClass
    public void initExtent() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("Stock Management system - Testing");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Dev Name", "Venkatesh");
        extent.setSystemInfo("Testers Name", "Navnath");
        extent.setSystemInfo("Project Name", "Stock Management System");
        extent.setSystemInfo("Deadline", "March 2026");
        extent.setSystemInfo("Version", "2.1");
    }


    @AfterClass
    public void writeToReport() {

        extent.flush();

    }


    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("valid");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();

        } catch (Exception c) {

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This Test is passed");
        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshot/"+getBugScreenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("invalid");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("34343");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("343");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();

        } catch (Exception c) {

        }
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        try {
            Assert.assertEquals(actual, expected, "incorrect or error message");
            test.pass("This Test is passed");
        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshot/"+getBugScreenshot(driver));

        }

    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("blank");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        try {
            Assert.assertEquals(actual, expected, "incorrect or error message");
            test.pass("This Test is passed");
         //   test.addScreenCaptureFromPath("./screenshot/"+getBugScreenshot(driver));

        } catch (AssertionError e) {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshot/"+getBugScreenshot(driver));

        }

    }
}
