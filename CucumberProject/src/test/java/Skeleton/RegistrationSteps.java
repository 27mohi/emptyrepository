package Skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.DriverUtility;

import Page.RegisterPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {
	WebDriver driver;
	RegisterPage page1;
	
	/*@Before
	public void init()
	{
	 driver=DriverUtility.getDriver("chrome");
	 page1=PageFactory.initElements(driver, RegisterPage.class);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}*/
	
	@Given("Url OF DemoWebShop")
	public void url_OF_DemoWebShop() {
		 driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("User enters the data for register")
	public void user_enters_the_data_for_register() {
		RegisterPage.gender.click();
		RegisterPage.FirstName.sendKeys("mohini");
		RegisterPage.LastName.sendKeys("mishra");
		RegisterPage.Email.sendKeys("ask5@gmail.com");
		RegisterPage.Password.sendKeys("abc123");
		RegisterPage.ConfirmPassword.sendKeys("abc123");
		RegisterPage.register.click();
	}

	@Then("user is register sucessfully")
	public void user_is_register_sucessfully() {
	String mssg =driver.findElement(By.cssSelector("div[class='result']")).getText();
	Assert.assertTrue(mssg.contains("registration completed"));
		
	}
	/*@After
	public void after()
	{
		driver.close();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}*/


}
