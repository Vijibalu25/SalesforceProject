package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseClassSalesforce;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends BaseClassSalesforce {

 
	@Before
	
	public void preConditions()
	{
		
		setDriver();
//        options=new ChromeOptions();
//		
//		options.addArguments("--disable-notifications");
	   //ChromeDriver driver = new ChromeDriver(options);
	
		getDriver().manage().window().maximize();
	
		getDriver().get("https://login.salesforce.com/");
	
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
	}
	
	@After
	public void postCondition() {
		getDriver().close();
	}
}
