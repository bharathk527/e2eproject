package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	public WebDriver driver;
	
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By login=By.id("login-button");
	By accepted=By.xpath("//h4[contains(text(),'Accepted usernames are:')]");

	
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement username()
	{
		return driver.findElement(uname);
		
	}
	public WebElement password()
	{
		
	return driver.findElement(pwd);
	}
	public WebElement login()
	{
		
	return driver.findElement(login);
	}
	public WebElement gettitle()
	{
		
	return driver.findElement(accepted);
	}
	
	
}
