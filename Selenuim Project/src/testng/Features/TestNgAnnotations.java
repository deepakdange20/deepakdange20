package testng.Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Test  //- we can declare this class level it will consider each method without any annotation as 1 test

public class TestNgAnnotations {

	@BeforeClass
	private void beforeClass() 
	{
		System.out.println("Before Class method");
	}

	@BeforeMethod(firstTimeOnly = true)
	public void	beforeMethod()
	{
		System.out.println("Before Method ");
	}

	//@Test(dataProvider = "methodName", dataProviderClass = SoftAssertion_And_HardAssertion.class)
	//if datapriveder method is in differant class
	
	@Test()
	public void Atest()
	{
		System.out.println("A");
	}
	
   @Test	//@Ignore// ignore particuler method 
	public void Btest()
	{
		System.out.println("B");
	}
	
	@Test(invocationCount = 4)
	public void Ctest()
	{
		System.out.println("C");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("After class method ");
	}

}

