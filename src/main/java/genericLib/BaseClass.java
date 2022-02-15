package genericLib;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	public WebDriverDriverUtilies driverutilies=new WebDriverDriverUtilies();
	
	
	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(pdata.getPropertyFileldata("url"));
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException 
	{
		int status = result.getStatus();
		String name = result.getName();
		
		if(status==2) {
			Screenshot  s=new Screenshot();
			s.getPhoto(driver, name);
		}
		
		driver.quit();
	}
	

}
