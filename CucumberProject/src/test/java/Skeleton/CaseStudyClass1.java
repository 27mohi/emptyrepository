package Skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CaseStudyClass1 {
	WebDriver driver;
	//@Before
	public void init()
	{
	 driver=DriverUtility.getDriver("chrome");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");	
	}
	//@After
	public void after()
	{   
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.close();
    }
	
	@Given("User Login as Admin")
	public void user_Login_as_Admin() {
		driver.findElement(By.id("userName")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Password456");
		driver.findElement(By.name("Login")).click();
	}

	@When("User add product details")
	public void user_add_product_details() {
	    driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/span")).click();
	    WebElement l= driver.findElement(By.id("categorydropid"));
	    Select sa = new Select(l);
	    sa.selectByValue("11290");
	    WebElement l1= driver.findElement(By.id("subcategorydropid"));
	    Select sa1 = new Select(l1);
	    sa1.selectByValue("112112");
	    driver.findElement(By.id("prodid")).sendKeys("HP Laptops");
	    driver.findElement(By.id("priceid")).sendKeys("114321");
	    driver.findElement(By.id("quantityid")).sendKeys("1");
	    driver.findElement(By.id("brandid")).sendKeys("hp");
	    driver.findElement(By.id("description")).sendKeys("good");
	    driver.findElement(By.name("Add Product")).click();
	    
	    
	    
	}

	@Then("verify new products displayed or not")
	public void verify_new_products_displayed_or_not() {
		 String a=driver.findElement(By.cssSelector("i[style='font-size: 20px']")).getText();
		 Assert.assertTrue(a.contains("HP Laptops is added Succesfully !!!"));
	}
	


}
