package steps;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import models.User;

public class ModelClassTest_steps {
	
	@Given("user logs into application")
	public void user_logs_into_application() {
	    System.out.println("Application loggin in");
	}

	@Then("user creates account for user info:")
	public void user_creates_account_for_user_info(List<User> users) {
	    System.out.println("User name: " + users.get(0).getFirstName());
	    System.out.println("User phoneNumber: " + users.get(0).getPhoneNum());
	}
	
	@Then("user verifies stuff")
	public void user_verifies_stuff() {
	    System.out.println("User verifies user infos");
	}
}
