package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellExchangePage {
	
	public SellExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//-----------web element of SELL LONGTERM WITH MARKET------
	@FindBy(xpath ="//a[text()='Sell']")
	private WebElement clickon_sellbtn;
	
	@FindBy(xpath ="//input[@id='quantity']")
	private WebElement enter_qty;
	
	@FindBy(xpath ="//button[@class='w-md btn btn-danger']")
	private WebElement clickon_sellbtn2;
	//-----------web element of SELL LONGTERM WITH CUSTOM------
	
	@FindBy(xpath="(//label[text()='Custom Limit'])[2]")
	private WebElement clickon_custombtn;
	
	@FindBy(xpath="(//input[@class='form-control form-control'])[2]")
	private WebElement provide_cstmprice;
	
	//-----------web element of SELL INTRADAY WITH MARKET------
	//@FindBy(xpath="//label[text()='Intraday'])[2]")
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[6]")
	private WebElement clickon_intraday;
	
	//-----------web element of SELL INTRADAY WITH CUSTOM------
	
	//----------methods for sell long term with market---------
	public void clickonsellbutton()
	{
		clickon_sellbtn.click();
	}
	public void enterquantity(String qty)
	{
		enter_qty.click();
		enter_qty.sendKeys(qty);
	}
	public void clickonsellbutton2()
	{
		clickon_sellbtn2.click();
	}
	//----------methods for sell long term with custom---------
	public void clickoncustombtn()
	{
		clickon_custombtn.click();
	}
	public void providecustomprice(String price)
	{
		provide_cstmprice.click();
		provide_cstmprice.sendKeys(price);
	}
	//----------methods for sell Intraday with Market---------
	public void clickonintradaybtn()
	{
		clickon_intraday.click();
	}


}
