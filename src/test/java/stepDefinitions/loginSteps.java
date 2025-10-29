package stepDefinitions;

import io.cucumber.java.en.*;

public class loginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step- user ins on login page");
	}

	@When("user enters username")
	public void user_enters_username() {
	   System.out.println("user inter username");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("user clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   System.out.println("user is searching for something");
	   
	   
	}


}
