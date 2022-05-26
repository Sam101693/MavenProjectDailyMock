package hyundaitestclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import hyundaipageclasses.FindACar;
import hyundaipageclasses.SearchCarFeatures;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataFromConfig;

public class HyundaiBaseTestClass 
{
	
	static WebDriver driver;
	FindACar fac;
	SearchCarFeatures obj;
	Actions act;
	JavascriptExecutor jse;
	
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
			
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		
		option.addArguments("--start-maximized");
		
		driver = new EdgeDriver(option);
		
		driver.get(ReadDataFromConfig.getDataFromConfig("testsiteurl"));
		
					
	}//initBrowser
	
	@BeforeClass
	public void objectCreation()
	{

		fac = new FindACar(driver);
		
		jse = (JavascriptExecutor)driver;
		
		obj = new SearchCarFeatures(driver, jse);
		
	}
	
}//HyundaiBaseTestClass
