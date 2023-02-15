package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class TransactionPageTest extends TestBase {

	@Test
	public void verifytransactionpage() throws InterruptedException
	{
		//------login-----------
	
		

		
		//-----transaction page will open and get data in console 
		dash_obj.clickontransactionbtn();
		trans_obj.getData();
		trans_obj.getAllData();
	}
}
