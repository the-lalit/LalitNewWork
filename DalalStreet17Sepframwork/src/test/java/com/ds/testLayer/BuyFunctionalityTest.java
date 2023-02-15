package com.ds.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class BuyFunctionalityTest extends TestBase{
	
	@Test
	public void VerifyBuyFunctionality() throws InterruptedException
	{
		//------login-----------
		
		//-------buy function----
		
		dash_obj.searchstock("Wipro");
		dash_obj.clickonstock();
		Thread.sleep(3000);
		//-----exchange page-----
		
		exchange_obj.clickonbuybtn1();
		exchange_obj.selectquantity("2");
		exchange_obj.clickonbuybtn2();
		
	}
	
	@Test
	public void VerifyBuyFunctionalitywithlongtermcustomlimit() throws InterruptedException
	{
		//------login-----------
	
		//-------buy function----
			
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
		//-----exchange page-----
			
				exchange_obj.clickonbuybtn1();
				exchange_obj.clickoncustom();
				exchange_obj.selectquantity("2");
				exchange_obj.enteryourprice("300");
				exchange_obj.clickonbuybtn2();
	}

	@Test
	public void VerifyBuyFunctionalitywithIntrdayMarket() throws InterruptedException
	{
		//------login-----------

		//-------buy function----
				
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				
		//-----exchange page-----
		
		exchange_obj.clickonbuybtn1();
		exchange_obj.clickonintrdaybtn();
		exchange_obj.selectquantity("2");
		exchange_obj.clickonbuybtn2();
							
				
	}
	@Test
	public void VerifyBuyFunctionalitywithIntrdayCustomt() throws InterruptedException
	{
		//------login-----------
			  

		//-------buy function----
			
				dash_obj.searchstock("Wipro");
				dash_obj.clickonstock();
				Thread.sleep(3000);
				
		//-----exchange page-----
		
		exchange_obj.clickonbuybtn1();
		exchange_obj.clickonintrdaybtn();
		exchange_obj.clickoncustom();
		exchange_obj.selectquantity("2");
		exchange_obj.enteryourprice("300");
		exchange_obj.clickonbuybtn2();
							
				
	}


}
