package com.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ds.pageLayer.AnotherExchgPage;
import com.ds.pageLayer.Dashboard;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.SellExchangePage;
import com.ds.pageLayer.TransactionPage;
import com.ds.utilities.ReadConfig;
import com.ds.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public LoginPage login_obj;
	public Dashboard dash_obj ;
	public ExchangePage exchange_obj;
	public AnotherExchgPage crypto_obj ;
	public UtilClass util_obj ;
	public SellExchangePage sell_obj;
	public TransactionPage trans_obj ;
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public void start()
	{
	Logger.getLogger("DalalStreet Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework execution stopped");
	}
	
    @Parameters("Browser")
	@BeforeMethod
	public void setUp(String abc ) throws InterruptedException
	{
		
		if(abc.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(abc.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (abc.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide browser name");
		}
			
		
        ReadConfig read_config = new ReadConfig();
		driver.get(read_config.getApplicationUrl());
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		login_obj = new LoginPage(driver);
		dash_obj= new Dashboard(driver);
		exchange_obj= new ExchangePage(driver);
		crypto_obj= new AnotherExchgPage(driver);
		util_obj= new UtilClass();
		sell_obj = new SellExchangePage (driver);
		trans_obj = new TransactionPage(driver);
		
		
		login_obj.enterEmailAddress(read_config.getEmailAddress());
		login_obj.enterpassword(read_config.getPassword());
		login_obj.clickon_loginbtn();
		
		Thread.sleep(3000);
	}
	@AfterMethod
	public void tearDown()
	{
	//	driver.quit();
	}

}
