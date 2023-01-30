package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {

	WebDriver driver=null;

//	@Before("@smoke")
	@Before(order=1)
//	@Before(value="@smoke",order=1)
	public void browserSetup() {
		
		System.out.println("I am inside browser setup");
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After(order=1)
	public void teardown() {

		System.out.println("I am inside teardown. closing browser");
		driver.close();
		driver.quit();
	
	}
	
	@After(order=2)
	public void teardown2() {

		System.out.println("==========I am inside teardown 2=========");	
	}
	
	@Before(order=0)
	public void setUp2() {
		System.out.println(" ----- I am inside setUp2 -------");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println(" ----- I am inside beforeSteps -------");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println(" ----- I am inside afterSteps --------");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside step-- user is on login page");
		
	}

	@When("user enter valid usename and password")
	public void user_enter_valid_usename_and_password() {
		System.out.println("inside step--user enter valid usename and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step--clicks on login button");
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		System.out.println("inside step--user navigated to the home page");
	}
}