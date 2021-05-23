package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxlocators {
	

public WebDriver driver;
By expandb=By.xpath("//*[@title=\'xpand all\']");

	
public checkboxlocators(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public WebElement expandb()
{
	return driver.findElement(expandb);
	
}

}
