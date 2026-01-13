package ScreenshotDemo;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginTestNGDemo {


    @Test
    public  void loginTest1() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");

        // 1. create the object reference of TakesScreenshot
        // assign a driver to it, typecast the driver

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs()

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyddMM_hhmmss").format(new Date());

        // 3. Copy this file object into a real image file

        FileUtils.copyFile(srcFile,new File("screenshot/img"+timeStamp+".png"));


    }


}
