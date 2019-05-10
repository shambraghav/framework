package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class p1 
{
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("before suit");
	}
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("after suit");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
//	//@Test
//	public void test()
//	{
//		System.out.println("test");
//	}

}
