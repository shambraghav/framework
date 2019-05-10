package testng;

import org.testng.annotations.Test;

public class p6 
{
	@Test(priority=-1)
	public void bmethod1()
	{
		System.out.println("method 1");
	}
	@Test(priority=-2,invocationCount=3)
	public void amethod2()
	{
		System.out.println("method 2");
	}
	@Test(priority=0)
	public void cmethod3()
	{
		System.out.println("method 3");
	}

}
