package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.AnotherExchgPage;
import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class ExchangesPtest extends TestBase {

	@Test
	public void VerifyExchangePageFunctions() throws InterruptedException
	{
		//------login-----------
	
		dash_obj.clickonExchangebtn();
		
		//------buy crypto------
		
		crypto_obj.clickoncryptobtn();
		crypto_obj.clickongmxcrypto();
	}
}
