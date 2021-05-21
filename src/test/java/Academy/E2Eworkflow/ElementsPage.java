package Academy.E2Eworkflow;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.elementfields;
import pageObjects.loginpage;

public class ElementsPage extends base{
@BeforeTest
	
	public void initialize() throws IOException {
		
		driver=initializedriver();
		
}

@Test(dataProvider="getdata")
public void elementspage1(String Fname,String email,String paddr,String caddr )
{
		 
		driver.get("https://demoqa.com/elements");
	driver.manage().window().maximize();

	elementfields e=new elementfields(driver);
	e.elementclick().click();
	e.textboxclick().click();
	//Assert.assertEquals("Text Box", actual);
	e.Fname().sendKeys(Fname);
	e.email().sendKeys(email);
	e.paddr().sendKeys(caddr);
	e.submit().click();


}
@DataProvider

public Object[][] getdata()
{
	Object[][] data=new Object[2][4];
	data[0][0]="bharath";
	data[0][1]="bkumar1807@gmail.com";
	data[0][2]="Ashok nagar kamareddy";
	data[0][3]="Ashok nagar kamareddy";
	data[1][0]="virat";
	data[1][1]="vk1809@gmail.com";
	data[1][2]="Delhi";
	data[1][3]="Mumbai";
	return data;
}
@AfterTest
public void close()

{
driver.close();	
}
private void elementsnav() {
	// TODO Auto-generated method stub
	
}
	

}
