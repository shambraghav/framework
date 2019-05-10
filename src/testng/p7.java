  package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class p7 
{
	@Test()
	public void bmethod1()
	{
		System.out.println("method 1");
		Assert.fail();
	}
	@Test(dependsOnMethods= {"bmethod1"})
	public void amethod2()
	{
		System.out.println("method 2");
		
	}


}
