package testng.Features;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertion_And_HardAssertion {

	SoftAssert softAssert;
	@BeforeMethod 
	public void setUp()
	{
		softAssert = new SoftAssert();
		
	}
	@Test
	public void softAssertion()
	{
		System.out.println("Launch Browser");
		System.out.println("Enter url");
		softAssert.assertEquals(true, false);//failed still execution is going on
		System.out.println("Enter username");
		System.out.println("Enter Password");
	
		softAssert.assertEquals(true, false);//failed still execution is going on
		System.out.println("Click on login button");
		softAssert.assertEquals(true, false); //failed still execution is going on
		System.out.println("Navigate into homepage");
	//	softAssert.assertAll();//without this test mark as passed so combine result collect in 
		//one object on that result assertAll gives result 
	}
	
	@Test
	public void hardAssertion() 
	{
		System.out.println("I am in hard assertion");
		System.out.println("I am in hard Asserttion");
		Assert.assertEquals(true, false,"Hardd asserrtion massage");//if it fails execution stops and test case mark as failed
		System.out.println("I am out of  hard Asserttion");
		//Assert.
	}
	
	
}
