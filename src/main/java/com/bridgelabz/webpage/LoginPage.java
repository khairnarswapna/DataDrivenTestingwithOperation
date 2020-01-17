
/**
 * Description : LoginPage.java init all web elements and Contains the Methods
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */
package com.bridgelabz.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


@Test
public class LoginPage 
{
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id ="pass")
	private WebElement Password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn;

	//Initialization
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String username)
	{
		Email.sendKeys(username);
	}
	public void setPassword(String password)
	{
		Password.sendKeys(password);
	}
	public void clickLogin() 
	{
		loginBtn.click();
	}
	
}
