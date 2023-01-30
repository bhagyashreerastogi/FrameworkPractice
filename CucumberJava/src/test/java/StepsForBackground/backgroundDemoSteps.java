package StepsForBackground;

import io.cucumber.java.en.*;

public class backgroundDemoSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("----- Inside ->user is on login page -------- ");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("----- Inside ->user enters username and password -------- ");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("----- Inside ->clicks on login button -------- ");
	}

	@Then("user navigates to the homepage")
	public void user_navigates_to_the_homepage() {
		System.out.println("----- Inside ->user navigates to the homepage -------- ");
	}

		
	@Given("user is logged in")
	public void user_is_logged_in() {
		System.out.println("inside -- user is logged in");
	}

	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
		System.out.println("inside -- user clicks on welcome link");
	}

	@Then("Logout link is present")
	public void logout_link_is_present() {
		System.out.println("inside -- Logout link is present");
	}

	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
		System.out.println("inside -- user clicks on dashboard link");
	}

	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
		System.out.println("inside -- quick launch toolbar is displayed");
	}
}
