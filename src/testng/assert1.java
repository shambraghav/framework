package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assert1 
{
	
	@Test()
	public void method1() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement textbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		textbox.click();
		boolean condi = textbox.isSelected();
		//Assert.assertEquals(condi, true);
		//Assert.assertTrue(condi);
		Assert.assertFalse(condi);//fail then stops the execution of that particular script
		System.out.println(1234);

		
	}


}
