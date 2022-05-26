package extentreport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentListenerClass implements ITestListener
{

	static ExtentReports extent = ExtentReportGen.extentReportGenerator();
	
	public static ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		
		test = extent.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		test.log(Status.PASS, "Test Case Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		test.fail(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		test.log(Status.SKIP, "Test Case Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) 
	{	
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		extent.flush();
		
	}
	
	

}
