/**
 * 
 */
package com.absoftpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Mrunal
 *
 */
public class MyAccountPage {
	
	WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("password");
	By loginBtn=By.name("login");
		
public  MyAccountPage(WebDriver driver)
{
this.driver=driver;
		
}

public void typeUsername()
{
	driver.findElement(username).sendKeys("testuser1");
	
	}

public void typePassword()
{
	driver.findElement(password).sendKeys("testpwd1");
	}

public void clickLoginBtn()
{
	driver.findElement(loginBtn).click();
	}
}
