package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asseert 
{
	
	@Test()
	public void method1() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(5000);
		String title = driver.getTitle();
//		if(title.equals("actiTIME - Enter Time-Track"))
//			System.out.println("pass");
//		else
//			System.out.println("fail");
		Assert.assertEquals(title, "actiTIME - Enter Time-Trac");
	}


}
