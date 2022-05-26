package hyundaitestclasses;

import org.testng.annotations.Test;

public class FindACarTest extends HyundaiBaseTestClass
{
	
	
	@Test(priority = 1)
	public void clickOnFindACarValidate()
	{
		
		fac.clickOnFindACar();
		
	}
	
	@Test(priority = 2)
	public void clickOnCarModelValidate()
	{
		
		fac.clickOnCarModel();
		
	}
	

}
