package steps;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.FacebookPost;
import page.ShoppingAccountCreationPage;
import page.ShoppingHomePage;
import utilities.Config;
import utilities.Driver;

public class ShoppingAccountCreation_steps {
	
	WebDriver driver = Driver.getDriver();
	ShoppingHomePage shp = new ShoppingHomePage();
	ShoppingAccountCreationPage sacp = new ShoppingAccountCreationPage();
	
	
	@Given("user goes to shopping homepage")
	public void user_goes_to_shopping_homepage() {
	    driver.get(Config.getValue("url"));
	}

	@Then("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		shp.signInBtn.click();
	}

	@Then("user sends {string} and clicks create an account button")
	public void user_sends_and_clicks_create_an_account_button(String emailAddress) {
	    Random rand = new Random();
	    int rNum = rand.nextInt(100000);
	    emailAddress = rNum + emailAddress;
		shp.emailField.sendKeys(emailAddress);
	    shp.createAccountBtn.click();
	}

	@Then("user chooses title {string}")
	public void user_chooses_title(String title) {
	    if(title.equalsIgnoreCase("mr")) {
	    	sacp.mrRadioBtn.click();
	    }else {
	    	sacp.mrsRadioBtn.click();
	    }
	}

	@Then("user completes first name {string}")
	public void user_completes_first_name(String firstNameTxt) {
	    sacp.firstName.sendKeys(firstNameTxt);
	}

	@Then("user completes last name {string}")
	public void user_completes_last_name(String lastNameTxt) {
	    sacp.lastName.sendKeys(lastNameTxt);
	}

	@Then("user completes password {string}")
	public void user_completes_password(String passwordTxt) {
	    sacp.password.sendKeys(passwordTxt);
	}

	@Then("user completes address {string}")
	public void user_completes_address(String address) {
	    sacp.address.sendKeys(address);
	}

	@Then("user completes city {string}")
	public void user_completes_city(String cityTxt) {
	    sacp.city.sendKeys(cityTxt);
	}

	@Then("user completes state {string}")
	public void user_completes_state(String stateTxt) {
	    Select stateDropdown = new Select(sacp.state);
	    stateDropdown.selectByVisibleText(stateTxt);
	}

	@Then("user completes zip {string}")
	public void user_completes_zip(String zipTxt) {
	    sacp.zip.sendKeys(zipTxt);
	}

	@Then("user completes mobile number {string}")
	public void user_completes_mobile_number(String mobileNum) {
	    sacp.mobileNumber.sendKeys(mobileNum);
	}

	@Then("user clicks register button")
	public void user_clicks_register_button() {
	    sacp.registerBtn.click();
	}

	@Then("user verifies {string}")
	public void user_verifies(String message) {
	    String actualMessage = sacp.accountCreationMessage.getText();
	    Assert.assertEquals("Account Creation message verification", message, actualMessage); 
	}
	
	@Then("user completes all user info:")
	public void user_completes_all_user_info(Map<String, String> userinfo) {
	    System.out.println(userinfo);
	    if(userinfo.get("title").equalsIgnoreCase("mr")) {
	    	sacp.mrRadioBtn.click();
	    }else {
	    	sacp.mrsRadioBtn.click();
	    }
	    sacp.firstName.sendKeys(userinfo.get("firstName"));
	    sacp.lastName.sendKeys(userinfo.get("lastName"));
	    sacp.password.sendKeys(userinfo.get("password"));
	    sacp.address.sendKeys(userinfo.get("address"));
	    sacp.city.sendKeys(userinfo.get("city"));
	    Select stateDropdown = new Select(sacp.state);
	    stateDropdown.selectByVisibleText(userinfo.get("state"));
	    sacp.zip.sendKeys(userinfo.get("zip"));
	    sacp.mobileNumber.sendKeys(userinfo.get("mNumber"));
	}
	
	@When("user sends info:")
	public void user_sends_info(List<FacebookPost> posts) {
	    System.out.println("Post size: " + posts.size());
	    System.out.println(posts.get(0).getComments());
	}

	
}
