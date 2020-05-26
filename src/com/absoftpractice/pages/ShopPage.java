package com.absoftpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {

	
	WebDriver driver;
	
	public  ShopPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(name="orderby")
	WebElement sortBy;
	
	@FindBy(how=How.XPATH,using="//h1[@class='page-title']")
	WebElement pageTitle;
	
	
	Select sort=new Select(sortBy);
	sort.selectByIndex(1);
}
