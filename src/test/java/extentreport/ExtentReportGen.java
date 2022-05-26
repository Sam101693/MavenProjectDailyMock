package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen
{
	
static ExtentReports extent;

public static ExtentReports extentReportGenerator()
{
	
	String path = System.getProperty("user.dir")+"//ExtentReports//HyundaiExtentReport.html";
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	
	reporter.config().setTheme(Theme.DARK);
	
	reporter.config().setReportName("Hyundai");
	
	extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	
	extent.setSystemInfo("Report By", "Group W");
	
	extent.setSystemInfo("Executed By", "Group W");
	
	extent.setSystemInfo("Environment", "SIT");
	
	return extent;
	
}//extentReportGenerator
}//ExtentReportGen
