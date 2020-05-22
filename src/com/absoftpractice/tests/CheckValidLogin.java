/**
 * 
 */
package com.absoftpractice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.absoftpractice.pages.MyAccountPage;

/**
 * @author Shri
 *
 */
public class CheckValidLogin {
	
	
	@Test
	public void verifySuccessfulLogin()
	{
		WebDriver driver=new ChromeDriver();
		String exePath = "C:\\Users\\Shri\\eclipse-workspace\\chromedriver.exe";
   	    System.setProperty("webdriver.chrome.driver", exePath);
   	 	driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/my-account/");
		
		MyAccountPage login=new MyAccountPage(driver);
		login.typeUsername();
		login.typePassword();
		login.clickLoginBtn();
		driver.quit();
	}

}
