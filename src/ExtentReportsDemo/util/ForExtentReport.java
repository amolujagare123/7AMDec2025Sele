package ExtentReportsDemo.util;

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
}
