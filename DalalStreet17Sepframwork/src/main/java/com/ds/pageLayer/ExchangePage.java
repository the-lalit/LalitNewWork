package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {
	
	public ExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//-------web elements for long term with MARKET-------
	@FindBy(xpath ="//a[text()='Buy']")
	//@FindBy(xpath ="//a[@class='active nav-link']")
	private WebElement buybtn1;
	
	@FindBy(xpath ="//input[@name='input-Qunatity']")
	private WebElement Select_qty;
	
	//@FindBy(xpath ="//button[text()='Buy']")
	@FindBy(xpath ="//button[@class='w-md btn btn-success']")
	private WebElement buybtn2;
	
	//-------web elements for long term with CUSTOM-------
	@FindBy(xpath = "//label[text()='Custom Limit']")
	private WebElement clickon_custom;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement enter_price;
	
	//-------web elements for INTRADAY with MARKET-------
	@FindBy(xpath ="//label[text()='Intraday']")
	private WebElement clickon_intraday;
	
	//-------methods for long term with MARKET-------
	public void clickonbuybtn1()
	{
		buybtn1.click();
	}
	public void selectquantity(String quantity)
	{
		Select_qty.click();
		Select_qty.sendKeys(quantity);
	}
	public void clickonbuybtn2()
	{
		buybtn2.click();
	}
	//-------methods for long term with custom-------
	public void clickoncustom()
	{
		clickon_custom.click();
	}
	public void enteryourprice(String price)
	{
		enter_price.click();
		enter_price.sendKeys(price);
	}
	//-------methods for intraday with market-------
	public void clickonintrdaybtn()
	{
		clickon_intraday.click();
	}
	//-------methods for Intraday with custom-------
	
	

}
