package Skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.DriverUtility;

import Page.CaseStudy2login;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudySteps2 {
	WebDriver driver;
	 CaseStudy2login page1;
	@Before
	public void init()
	{
	 driver=DriverUtility.getDriver("chrome");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");	
	 
	}
	@After
	public void after()
	{   
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.close();
    }
	@Given("User add atleast one product to the cart")
	public void user_add_atleast_one_product_to_the_cart() {
		
		//driver.findElement(By.partialLinkText("SignIn")).click();
		 CaseStudy2login.userName.sendKeys("Lalitha");
		 CaseStudy2login.password.sendKeys("Password123");
		 CaseStudy2login.login.click();
		 Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Categories"))).perform();
		act.moveToElement(driver.findElement(By.partialLinkText("Home Appliances"))).click().perform();
		act.moveToElement(driver.findElement(By.partialLinkText("Floor"))).click().perform();
		 
	}

	@When("Larry added a headphone to cart")
	public void larry_added_a_headphone_to_cart() {
		CaseStudy2login.add.click();
		CaseStudy2login.cart.click();
		
	}

	@When("Checkout for the payement")
	public void checkout_for_the_payement() {
		CaseStudy2login.Checkout.click();
		CaseStudy2login.proceed.click();//click on proceed to pay
	
	}

	@When("Fill the transcation Detalis")
	public void fill_the_transcation_Detalis() {
	  
	}

	@Then("Product sucessful order")
	public void product_sucessful_order() {
	 
	}


}
