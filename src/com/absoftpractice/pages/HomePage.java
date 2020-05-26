package com.absoftpractice.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver localdriver) {
		this.driver=localdriver;
		
	}

	//
	@FindBy(xpath="//font[contains(text(),'ABSoft')]")
	WebElement logo;
	
	@FindBy(how=How.XPATH,using="//h1[contains(text(),'Welcome to our E-Commerce test web site')]")
	WebElement welcomeText;
	
	public String[] checkHomePgDisplayed()
	{
		String wctxt[]=new String[2];
		wctxt[0] =welcomeText.getText();
		wctxt[1]=logo.getText();
		return wctxt;
	
		
		
	}
	
	
}
