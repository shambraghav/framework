package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class grouping 
{
	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("method 1");
		Assert.fail();
		
	}
	
	@Test(groups= {"smoke","functional"})
	public void method2()
	{
		System.out.println("method 2");
	}
	
	@Test(dependsOnGroups= {"smoke"})
	public void method3()
	{
		System.out.println("method 3");
	}


}
