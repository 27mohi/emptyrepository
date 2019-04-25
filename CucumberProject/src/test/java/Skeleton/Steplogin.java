package Skeleton;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.test.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steplogin {
	WebDriver driver;
	
	/*@Before
	public void before()
	{
		 driver=DriverUtility.getDriver("chrome");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@After
	public void after()
	{
		driver.close();
	}*/
	@Given("The URL of TestMe APP")
	public void the_URL_of_TestMe_APP() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@When("user enters {word} as username")
	public void user_enters_as_username(String username) {
	    
	 driver.findElement(By.id("userName")).sendKeys(username);
	

	}

	@When("user enters {word} as password")
	public void user_enters_as(String password) {
	    
		 driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("user is in (Home|Admin Home)")
	public void user_is_in_home_page() {
	    
		 driver.findElement(By.name("Login")).click();
		 Assert.assertTrue(driver.getTitle().contains("Home"));
		 
	}
	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
List<List<String>> list=dataTable.asLists();
	for(List<String> list2 : list)
	{
		for(String s : list2)
	{
		System.out.print(s+"\t");
	}
	System.out.println();
	}
	}

	@Then("user is in loginpage")
	public void user_is_in_loginpage() {
	   
	}

}
