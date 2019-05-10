package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softasser 
{
	
	@Test()
	public void method1() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		textbox.click();
		boolean condi = textbox.isSelected();
		SoftAssert so = new SoftAssert();
		so.assertFalse(condi);
		System.out.println(1234);
		so.assertAll();//stops the execution their itself

		
	}


}
