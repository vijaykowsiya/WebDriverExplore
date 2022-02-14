package expwebdrvjava;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Listener extends ParallelDemo implements ITestListener  {

	ExtentReports extentreports = new ExtentReports();
	ExtentTest test;
	
	ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("report.html");
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart Method");
		test = extentreports.createTest(result.getMethod().getMethodName());
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method");
		
		test.pass("PASSED");
		
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("******************TEST FAILED ******************");
		
		test.fail("Failed");
		try {
		takesScreenshotOnFailure(result.getMethod().getMethodName());
			
			test.addScreenCaptureFromPath("htmlreports.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Method");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage Method");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart Method");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish Method");
		
		extentreports.attachReporter(htmlreport);
		
	}
	
	

}
