package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class LogoutFunctionalityTest extends TestBase {
	
	@Test
     public void verifylogoutfunctionality() throws InterruptedException
     {
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
		//------login-----------
			
				
				
	    //------logout------
				dash_obj.clickonprofilebtn();
				dash_obj.clickonoweroffbtn();
				
				String actual_result = util_obj.getWebPageUrl();
				Assert.assertEquals(actual_result, expected_result);

     }

}
