package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//-----------Web elements of selection of stocks----
	@FindBy(xpath = "//input[@class = 'form-control']")
	private WebElement search_txtbox;
	
	@FindBy(xpath ="(//div[@class = 'm-4 card'])[2]")
	private WebElement clickon_option;
	
	//-----------Web elements of logout function----
	@FindBy(xpath="//button[@id='page-header-user-dropdown']")
	private WebElement clickon_profile;
	
	@FindBy(xpath="//span[text()='Power Off']")
	private WebElement clickon_poweroff;
	
	//-----------Web elements of transaction page function----
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement clickon_transaction;
	
	//-----------Web elements for go on exchange page----
	//@FindBy(xpath="//a[@class='nav-link dropdown-toggle arrow-none']")
	@FindBy(xpath="//a[text()='Exchanges']")
	private WebElement clickon_exchanges;
	
	//-----------methods for selection of stocks----
	public void searchstock(String stockname)
	{
		search_txtbox.sendKeys(stockname);
	}
	public void clickonstock()
	{
		clickon_option.click();
	}
	//-----------Methods for logout function----
	public void clickonprofilebtn()
	{
		clickon_profile.click();
	}
	public void clickonoweroffbtn()
	{
		clickon_poweroff.click();
	}
	public void clickontransactionbtn()
	{
		clickon_transaction.click();
	}
	//-----------Methods for go on exchange page----
	public void clickonExchangebtn()
	{
		clickon_exchanges.click();
	}

}
