package Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	ExtentHtmlReporter htmlReporter;
	
	ExtentReports extent;
	
	
	@BeforeTest
	public void SetUpER()
	{
		
		// initialize the HtmlReporter
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		
		// initialize ExtentReports and attach the HtmlReporter
		 extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		
	}
	
	
	@Test
	public void Test1() throws IOException
	{
		
		ExtentTest test = extent.createTest("MyFirstTest");
		
		test.log(Status.INFO, "pass");

		test.info("This ste shows usauge of info ");
		
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	
	}
	@Test
	public void Test2() throws IOException
	{
		
		ExtentTest test = extent.createTest("MyFirstTest");
		
		test.log(Status.INFO, "pass");

		test.info("This ste shows usauge of info ");
		
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	
	}
	
	
	
	@AfterTest
	public void Teardown()
	{
		
		extent.flush();
		
	}


}
