package Academy.E2Eworkflow;

import java.io.IOException;
import java.lang.reflect.Array;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.loginpage;

public class Homepage extends base {
	
	
	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver=initializedriver();
	}
	@Test(dataProvider="getdata")
	public void basepagenav(String uname,String pwd) throws IOException
	{
	 
	
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();

loginpage l=new loginpage(driver);

Assert.assertEquals(l.gettitle().getText(), "Accepted usernames are:");
l.username().sendKeys(uname);
l.password().sendKeys(pwd);
l.login().click();
	}
	
	@AfterTest
	public void end()
	{
		driver.close();
	}
@DataProvider

public Object[][] getdata()
{
	Object[][] data=new Object[2][2];
	data[0][0]="standard_user";
	data[0][1]="secret_sauce";
	data[1][0]="locked_out_user";
	data[1][1]="secret_sauce";
	return data;
}

	
	
}
