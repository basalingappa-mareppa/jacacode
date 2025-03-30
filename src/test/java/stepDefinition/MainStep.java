package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStep {
	
	@Given("user is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("user is on netbanking landing page");
	    
	}
	@When("user login into the appication with {string} and password {string}")
	public void user_login_into_appication_with_and_password(String username, String password) {
		System.out.println(username+"and password is"+password);
	}
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("home page is displayed");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards are displayed");
	}
}
