package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ProFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleSearchPageObjects;

public class searchTest {
	
	private static WebDriver driver = null;
	public static String BrowserName = null ;
	
	//Before Test
	
	@BeforeTest
	public  void WebdriverSetUp () throws Exception{
		
		ProFile.getpro();
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			
		}
	}
			
	
	//Test
	@Test
	
	public  void googlesearchtest () throws Exception {
	
	googleSearchPageObjects sObj = new googleSearchPageObjects(driver);
	driver.get("https://www.google.com/");
	sObj.settextinbox("ABCD");
	sObj.clickbutton();
	driver.close();
	ProFile.setpro();
	}

}

