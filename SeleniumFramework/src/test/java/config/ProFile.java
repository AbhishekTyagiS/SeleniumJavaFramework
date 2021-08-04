package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.searchTest;

public class ProFile {

	static Properties prop = new Properties();
	static String ProPath = System.getProperty("user.dir");
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getpro();
		setpro();
		getpro();

	}
	
	public static void getpro() throws Exception
	{
	
		InputStream input = new FileInputStream(ProPath+ "/src//test/java//config/config.properties");
		
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		searchTest.BrowserName=browser;
	}
	
	
	public static void setpro() throws Exception
	{
		
		
		OutputStream output = new FileOutputStream(ProPath+ "/src//test/java//config/config.properties");
		
		prop.setProperty("result","pass");
		prop.store(output,null);
	}

}
