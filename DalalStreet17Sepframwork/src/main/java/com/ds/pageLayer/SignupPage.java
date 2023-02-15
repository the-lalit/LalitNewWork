package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname_box;
	
	@FindBy(xpath ="//input[@name='lastName']")
	private WebElement lastname_box;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_box;
	
	@FindBy(xpath= "//input[@name='password']")
	private WebElement pass_box;
	
	@FindBy(xpath= "//input[@name='agreement']")
	private WebElement check_box;
	
	@FindBy(xpath= "//button[@class='btn btn-success btn-block']")
	private WebElement getyourjourneystart;
	
	//------------ action methods -------------
	
	public void enterFirstName(String firstname)
	{
		firstname_box.sendKeys(firstname);
	}
	public void enterLastName(String lastname)
	{
		lastname_box.sendKeys(lastname);
	}
	public void enterEmail(String email)
	{
		 email_box.sendKeys(email);
	}
	public void enterPass(String password)
	{
		pass_box.sendKeys(password);
	}
	public void clickoncheckbox()
	{
		check_box.click();
	}
	public void clickonsubmit()
	{
		getyourjourneystart.click();
	}
	

}
