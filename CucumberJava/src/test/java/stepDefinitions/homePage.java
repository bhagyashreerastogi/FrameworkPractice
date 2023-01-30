package stepDefinitions;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class homePage {

	WebDriver driver =null;	


	@Given("browser is open")
	public void browser_is_open() {

		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);

		System.out.println("inside step- browser is open");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	/*
	 * @When("user enters fleet site url and hit enter") public void
	 * user_enters_fleet_site_url_and_hit_enter() {
	 * System.out.println("inside step- user enters fleet site url and hit enter");
	 * driver.navigate().to("https://www.fcausfleet.com/");
	 * 
	 * }
	 */

	@Then("user navigates to Fleet home page")
	public void user_navigates_to_Fleet_home_page() {
		System.out.println("inside step- user is at Fleet home page");

	}
	/*
	 * @And("user clicks on register link") public void register_link_is_present() {
	 * System.out.println("inside step-user clicks on register link ");
	 * driver.findElement(By.xpath("//span[contains(text(),'REGISTER/LOG IN')]")).
	 * click();
	 * 
	 * }
	 */
}
