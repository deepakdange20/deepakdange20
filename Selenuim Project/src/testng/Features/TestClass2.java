package testng.Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeSuite
	private void beforeSuit() 
	{
		System.out.println("Before suit2 method");
	}
	@BeforeTest
	private void beforeTest() 
	{
		System.out.println("Before Testclass2 method");
	}
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

	
	@Test(groups = {"X", "y"})
	public void Dtest()
	{
		System.out.println("D");
	}
	
	@Test	(groups = "X")
	public void Etest()
	{
		System.out.println("E");
	}
	
	@Test(groups = "Y")
	public void Ftest()
	{
		System.out.println("F");
	}

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("After testclass2 method ");
	}

	@AfterSuite
	private void afterSuit() 
	{
		System.out.println("after suit2  method");
	}
}
