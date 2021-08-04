package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListen implements ITestListener {


	public   void onTestStart(ITestResult result)
	{
		System.out.println("********Test started : "+result.getName());
	}


	public void onTestSuccess(ITestResult result)
	{
		System.out.println("********Test success : "+result.getName());
	}


	public void onTestFailure(ITestResult result) 
	{
		System.out.println("********Test failed : "+result.getName());
	}


	public void onTestSkipped(ITestResult result)
	{
		System.out.println("********Test Skipped : "+result.getName());
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		//
	}




	public void onStart(ITestContext context) 
	{
		// not implemented
	}


	public void onFinish(ITestContext context)
	{
		System.out.println("********Test Finsish : "+ context.getName());
	}
}



