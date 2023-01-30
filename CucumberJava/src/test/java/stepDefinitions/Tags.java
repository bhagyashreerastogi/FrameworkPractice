package stepDefinitions;

import io.cucumber.java.en.*;

public class Tags {

	@Given("user is on home page")
	public void user_is_on_home_page() {
	   System.out.println("user is on home page");
	}

	@When("user clicks login")
	public void user_clicks_login() {
		System.out.println("user clicks login");
	}

	@Then("user navigates to login page")
	public void user_navigates_to_login_page() {
		System.out.println("user navigates to login page");
	}

}