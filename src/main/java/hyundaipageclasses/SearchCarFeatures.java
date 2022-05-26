package hyundaipageclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCarFeatures extends ReadDataFromConfig
{
	WebDriver driver;
	JavascriptExecutor jse;
	
	@FindBy (xpath = "//*[@class='btnGnbSearch']") WebElement search_icon;
	
	@FindBy (xpath = "//*[@class='inputText gnbSearchActive']") WebElement search_box;
	
	@FindBy (xpath = "//*[@id='btnGNBSearch']") WebElement search_icon_on_search_box;
		
	public SearchCarFeatures(WebDriver driver, JavascriptExecutor jse)
	{
			
		this.driver = driver;
		
		this.jse = jse;
		
		PageFactory.initElements(driver, this);
		
	}//SearchCarFeatures
	
	public void clickOnSearchIcon()
	{
		
		search_icon.click();		
		
	}//clickOnSearchIcon
	
	public void searchCarFeatures() 
	{
		
		search_box.sendKeys("ALCAZAR");
		
		search_icon_on_search_box.click();
		
		jse.executeScript("window.scrollBy(0,800)");
	
	}//searchCarFeatures

}//SearchCarFeatures
