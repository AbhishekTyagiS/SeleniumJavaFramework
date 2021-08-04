package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjects {
	
	WebDriver driver = null;
	
	//Google search box
	By textbox_search = By.xpath("//input[@title='Search']");
	
	//google searct button
	By button_Search = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");

	public googleSearchPageObjects(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	public void settextinbox(String Text)
	
	{
		
		driver.findElement(textbox_search).sendKeys(Text);
		
	}
	
	
	public void clickbutton()
	
	{
		
		driver.findElement(button_Search).sendKeys(Keys.RETURN);
		
	}
	
	
}
