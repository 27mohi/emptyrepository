package Skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	Person sean=new Person();
			
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   sean.setDistance(int1);
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	sean.setMessage(string);
	}

	@Then("Lucia {string} to the message")
	public void lucia_listens_to_the_message(String flag) {
	    
		// Write code here that turns the phrase above into concrete actions
		if(flag.contentEquals("listens"))
		{
			String message=sean.getMessage();
			Assert.assertEquals("Free Coffee", message);
		}
		else if(flag.contentEquals("cannot listens"))
		{
			String message= sean.getMessage();
			  Assert.assertEquals("CANOT HEAR", message);
		}
	 
	}
}
