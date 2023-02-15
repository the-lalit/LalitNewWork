package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//-------------- obj repo -----------------
	@FindBy(xpath ="//input[@name = 'email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath ="//input[@name = 'password']")
	private WebElement pass_box;
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[text()='Signup now']") private WebElement SignUp_btn;
	//@FindBy(xpath="//a[@class='fw-medium text-primary']") private WebElement SignUp_btn;
	
	//------------ action methods -------------
	public void enterEmailAddress(String email)
	{
		email_txtbox.sendKeys(email);
	}
	public void enterpassword(String password)
	{
		pass_box.sendKeys(password);
	}
	public void clickon_loginbtn()
	{
		login_btn.click();
	}
	public void ClickOnSignUp_btn() 
	{
		SignUp_btn.click();
	}
	
	

}
