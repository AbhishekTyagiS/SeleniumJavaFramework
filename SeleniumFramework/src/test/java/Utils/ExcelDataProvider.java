package Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.ProFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	
	private static WebDriver driver = null;

	
	
	@BeforeTest
	public  void WebdriverSetUp () throws Exception{
		
	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
	
		}
	
	
	@Test (dataProvider = "DataExcel" )
	public void Test1(String Uname, String Pword)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Uname);

		driver.findElement(By.id("txtPassword")).sendKeys(Pword);
		//driver.ffindElement(By.id("txtPassword")).click();
	//	System.out.println(Uname+ " | " +Pword );
	
		
		
	}

	//static	String ProjectPath ;

//	public static void main(String[] args) throws Exception {
//
	//	String Epath = "C:\\Users\\91986\\eclipse-workspace\\SeleniumFramework\\Excel\\Data.xlsx";
//
	//	TestData( Epath,  "Sheet1");
	//}
	
	
	@DataProvider(name = "DataExcel")
	public Object[][]  getdataDP() throws IOException
	
	{
		String Epath = "C:\\Users\\91986\\eclipse-workspace\\SeleniumFramework\\Excel\\Data.xlsx";

		Object  data[][]=TestData( Epath, "Sheet1");
		return data;
	}


	public  static Object[][] TestData(String Epath, String Esheet) throws IOException {



		//ProjectPath = System.getProperty("user.dir");
		Excelutil ExcelDP = new Excelutil( Epath,  Esheet);


		int rowC = 	ExcelDP.getRowcount();
		int colC =	ExcelDP.getcolcount();
		
		Object data [][] = new Object[rowC - 1][colC];


		for(int i=1;i<rowC;i++)

		{
			for(int j=0;j<colC;j++)
			{

				String CellD = 	ExcelDP.getRowdataString(i,j);
			//	System.out.print(CellD+ "|");
				
				data[i-1][j] = CellD;
			}


		}
		return data;

	}
}