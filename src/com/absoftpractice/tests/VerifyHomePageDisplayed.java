package com.absoftpractice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.absoftpractice.pages.HomePage;
import com.absoftpractice.utils.BrowserFactory;

public class VerifyHomePageDisplayed {

	@Test
	public void verifyHomePageContent()
	{
	
	WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://test1.absofttrainings.com/");
	
	HomePage homePg=new HomePage(driver);
	
	PageFactory.initElements(driver, homePg);
	
	String logo1="ABSoft";
	String expectedWc="Welcome to our E-Commerce test web site";
		
	String actualLogo=homePg.checkHomePgDisplayed()[1];
	String actualWctext=homePg.checkHomePgDisplayed()[0];
	
	Assert.assertEquals(actualLogo, logo1);
	Assert.assertEquals(actualWctext, expectedWc);
		driver.quit();
	
	
	
	}
}
