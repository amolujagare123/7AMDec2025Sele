package ExtentReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {


    public static String getBugScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign a driver to it, typecast the driver

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs()

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyddMM_hhmmss").format(new Date());

        String fileName = "img"+timeStamp+".png";

        // 3. Copy this file object into a real image file

        FileUtils.copyFile(srcFile,new File("Reports/screenshot/"+fileName));

        return fileName;
    }

    public static  ExtentReports initExtentObject() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("Stock Management system - Testing");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Dev Name", "Venkatesh");
        extent.setSystemInfo("Testers Name", "Navnath");
        extent.setSystemInfo("Project Name", "Stock Management System");
        extent.setSystemInfo("Deadline", "March 2026");
        extent.setSystemInfo("Version", "2.1");

        return extent;
    }
}
