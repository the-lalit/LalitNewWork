package com.ds.utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testBase.TestBase;

public class ListnerOfProject extends TestBase implements  ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case execution started - "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case execution completed - "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test case execution failed - "+result.getName());
		try {
			UtilClass.takeSS(driver, result.getName()+"-"+System.currentTimeMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test case execution skipped - "+result.getName());
	}
	
	

}
