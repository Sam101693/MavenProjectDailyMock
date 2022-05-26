package hyundaipageclasses;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindACar 
{
	
	WebDriver driver;
	
	
	@FindBy (xpath = "//*[@class='dep1_a findCar']") WebElement findacar;
	
	@FindBy (xpath = "(//a[@href='/in/en/find-a-car/i20'])[1]") WebElement findcarmodel;
	
	
	
	
	public FindACar(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}//FindACar
	
	public void clickOnFindACar()
	{
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		findacar.click();	
		
	}//clickOnFindACar
	
	public void clickOnCarModel()
	{
		
		
		findcarmodel.click();
		
		
	}//clickOnCarModel
	
	
	

}
