package Academy.E2Eworkflow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class base {
	
	
	public WebDriver driver;

	public WebDriver initializedriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\E2Eworkflow\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
				
		}
		else if(browsername.equals("firefox"))
		{
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browsername.equals("ie"))
		{
		
			System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		
	}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		
	}
	public void getscreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationfile));
		
		
	}
	
}
	
