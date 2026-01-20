package ExtentReportsDemo.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testngDemo.realDemo.Base;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReport.getBugScreenshot;
import static ExtentReportsDemo.util.ForExtentReport.initExtentObject;

public class MyExtentListeners extends Base implements ITestListener
{

    ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("this test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.fail("this test is failed :"+result.getThrowable());

        try {
            test.addScreenCaptureFromPath("./screenshot/"+getBugScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if(extent==null)
             extent = initExtentObject();
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();
    }
}
