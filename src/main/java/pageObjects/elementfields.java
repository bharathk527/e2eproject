package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementfields {
	
	
public WebDriver driver;
	
	By Fname=By.id("userName");
	
	By email=By.id("userEmail");
	By caddr=By.id("currentAddress");
	By paddr=By.id("permanentAddress");
	By submit=By.id("submit");
	By eclick=By.xpath("//div[contains(text(),'Elements')]");
	
	By tclick=By.xpath("//span[contains(text(),'Text Box')]");
	

	
	
	public elementfields(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement Fname()
	{
		return driver.findElement(Fname);
		
	}
	
	public WebElement textboxclick()
	{
		return driver.findElement(tclick);
		
	}
	public WebElement elementclick()
	{
		return driver.findElement(eclick);
		
	}
	public WebElement email()
	{
		
	return driver.findElement(email);
	}
	public WebElement caddr()
	{
		
	return driver.findElement(caddr);
	}
	public WebElement paddr()
	{
		
	return driver.findElement(paddr);
	}
	public WebElement submit()
	{
		
	return driver.findElement(submit);
	}
	

}
