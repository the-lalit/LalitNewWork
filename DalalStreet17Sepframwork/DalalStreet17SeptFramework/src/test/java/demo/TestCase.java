package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.testBase.TestBase;

public class TestCase extends TestBase{

	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		login_obj.enterEmailAddress(excel_data.readData("Login", 2, 1));
		login_obj.enterPassword(excel_data.readData("Login", 2, 2));
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		String actual_output = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_output, expected_output);
	}
	
}
