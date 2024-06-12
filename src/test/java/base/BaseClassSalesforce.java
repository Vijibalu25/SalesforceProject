package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClassSalesforce extends AbstractTestNGCucumberTests {
	
	public ChromeOptions options;
	private static final ThreadLocal<ChromeDriver> cdDriver = new ThreadLocal<>();
	
	public void setDriver()
	{
		options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		cdDriver.set(new ChromeDriver(options));
	}
	
	public ChromeDriver getDriver()
	{
		return cdDriver.get();
	}
	
	@BeforeMethod
	
	public void preConditions()
	{
		
		setDriver();

	
		getDriver().manage().window().maximize();
	
		getDriver().get("https:login.salesforce.com/");
	
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

}
