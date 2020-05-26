package com.absoftpractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.absoftpractice.pages.ShopPage;
import com.absoftpractice.utils.BrowserFactory;

public class CheckSortOptionShop {

	WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://test1.absofttrainings.com/shop/");
	
	ShopPage shopPg=new ShopPage(driver);
	
	
	@Test
	public void checkLowToHighOpt()
	{
		PageFactory.initElements(driver, shopPg);
		shopPg.selectOtpt(3).click();
		
		System.out.println("clicked");

		String firstProdDisplayed=driver.findElement(By.xpath("//h3[contains(text(),'Test Product1')]")).getText();
		
		System.out.println(firstProdDisplayed);
		
		Assert.assertEquals(firstProdDisplayed, "Test Product1");
		
		
	}
	
	@Test
	public void checkSortBypopularity()
	{
		PageFactory.initElements(driver, shopPg);
		shopPg.selectOtpt(0).click();
		
		String firstProdDisplayed=driver.findElement(By.xpath("//h3[contains(text(),'Test Product1')]")).getText();
		Assert.assertEquals(firstProdDisplayed, "Test Product1");	
		
	
	}
	
	@Test
	public void checkSortByRating()
	{
		PageFactory.initElements(driver, shopPg);
		shopPg.selectOtpt(1).click();
		
		String firstProdDisplayed=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/h3[1]")).getText();
		System.out.println(firstProdDisplayed);
		Assert.assertEquals(firstProdDisplayed, "Sony Phone");
	}
	
	@AfterClass
	public void afterTest()
	{
		driver.quit();
	}
}
