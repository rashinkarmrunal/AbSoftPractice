package com.absoftpractice.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.absoftpractice.utils.BrowserFactory;

public class CheckSortOptionShop {

	@Test
	public void checkSorting()
	{
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://test1.absofttrainings.com/shop/");
		
	}
	
	
}
