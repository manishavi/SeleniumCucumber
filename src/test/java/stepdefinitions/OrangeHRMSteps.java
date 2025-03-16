package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OrangeHRMSteps {
	
	
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		driver = new ChromeDriver();
	}

	@When("I open OrangeHRM homepage")
	public void i_open_orange_hrm_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@Then("I verify that the logo is present on page")
	public void i_verify_that_the_logo_is_present_on_page() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(true, status);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
}
