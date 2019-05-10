package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporter 
{
	@Test()
	public void method1()
	{
		
		Reporter.log("method1", false);
	}
	
	@Test()
	public void method2()
	{
		Reporter.log("method2", false);
	}
	
	@Test()
	public void method3()
	{
		Reporter.log("method3", false);
	}


}
