package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnotherExchgPage {
	
	public AnotherExchgPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//-----------Web elements for purchase crypto----
	@FindBy(xpath ="//a[@class='active nav-link']")
	//@FindBy(xpath ="//a[text()='Crypto Simulator']")
	private WebElement clickon_crypto;
	
	@FindBy(xpath="//a[text()='GMX']")
	private WebElement clickon_GMXcrypto;
	
	//-----------Method to purchase crypto----
	public void clickoncryptobtn()
	{
		clickon_crypto.click();
	}
	public void clickongmxcrypto()
	{
		clickon_GMXcrypto.click();
	}
	

}
