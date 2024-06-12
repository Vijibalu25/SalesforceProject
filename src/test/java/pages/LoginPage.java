package pages;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import base.BaseClassSalesforce;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;

public class LoginPage extends BaseClassSalesforce {
	
	@Given("Enter the username as {string}")
	public void enterUsername(String uname)
	{
		getDriver().findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
	}

	@And("Enter the password as {string}")
	public void enterPassword(String pWord)
	{
		getDriver().findElement(By.id("password")).sendKeys("Leaf$123");
	}
	
	@When("Click on Login")
	public void clickLogin() {
		getDriver().findElement(By.id("Login")).click();
	}
	
	@Then("Homepage will be displayed")
	public void verifyTitle() throws InterruptedException {
		
		Thread.sleep(3000);
		String expectedHomepageTitle="Home | Salesforce";
		String actualHomepageTitle = getDriver().getTitle();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actualHomepageTitle, expectedHomepageTitle, "HomePageVerified");
		sa.assertAll();
		
		
	}
}
