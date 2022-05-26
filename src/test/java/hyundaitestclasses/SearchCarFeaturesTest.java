package hyundaitestclasses;

import org.testng.annotations.Test;

public class SearchCarFeaturesTest extends HyundaiBaseTestClass
{
	
	@Test(priority = 3)
	public void clickOnSearchIconValidate()
	{
		
		
		obj.clickOnSearchIcon();
		
	}//clickOnSearchIconValidate
	
	@Test(priority = 4)
	public void searchCarFeaturesValidate()
	{
		
		
		obj.searchCarFeatures();
		
		
	}//searchCarFeaturesValidate

}
