package testng.Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestClass1 {
	@BeforeSuite
	private void beforeSuit() 
	{
		System.out.println("Before suit method");
	}
	
	@BeforeTest
	private void beforeTest() 
	{
		System.out.println("Before Testclass1 method");
	}
	@BeforeClass
	private void beforeClass() 
	{
		System.out.println("Before Class method");
	}

	@BeforeMethod
	public void	beforeMethod()
	{
		System.out.println("Before Method ");
	}

	
	@Test
	public void Atest()
	{
		System.out.println("A");
	}
	
	@Ignore
	public void Btest()
	{
		System.out.println("B");
	}
	
	@Test
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
	@AfterTest
	private void afterTest() 
	{
		System.out.println("after Testclass1 method");
	}
	
	@AfterSuite
	private void afterSuit() 
	{
		System.out.println("after suit  method");
	}
}
