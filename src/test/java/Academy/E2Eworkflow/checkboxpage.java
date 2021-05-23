package Academy.E2Eworkflow;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.checkboxlocators;
import pageObjects.elementfields;

public class checkboxpage extends base {

	public WebDriver driver;
@BeforeTest
	
	public void initialize() throws IOException {
		
		driver=initializedriver();
}

@Test
public void checkbox()

{
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();

		checkboxlocators cl=new checkboxlocators(driver);
		cl.expandb().click();
		
		
}
@AfterTest
public void close()

{
driver.close();	
}
}

