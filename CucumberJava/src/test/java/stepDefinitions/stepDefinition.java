package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.loginPage_PF;
//import pages.loginPage;

public class stepDefinition {

	WebDriver driver = null;
	loginPage_PF lp;
	
	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {

		System.out.println("inside step-user is on landing page");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath);
		System.out.println("inside step- browser is open");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@And("user enters fleet site url and hit enter")
	public void user_enters_fleet_site_url_and_hit_enter() throws InterruptedException {
		System.out.println("inside step- user enters fleet site url and hit enter");
		driver.navigate().to("https://www.fcausfleet.com/");
		Thread.sleep(1000);
	}

	@And("user accepts cookies")
	public void user_accepts_cookies() {
		System.out.println("inside step-user is accepting cookies ");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}

	@And("user clicks on register link")
	public void register_link_is_present() {
		System.out.println("inside step-user clicks on register link ");
		driver.findElement(By.xpath("//span[contains(text(),'REGISTER/LOG IN')]")).click();
	}

	@When("^user login into application with (.*) and (.*)$")
	public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {

		System.out.println("inside step-user login into application with username and password");
		System.out.println("User is entering username and password");
		
		lp=new loginPage_PF(driver);
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLoginButton();
		
	//	driver.findElement(By.id("login-email-field")).sendKeys(username);
	//	driver.findElement(By.id("login-pwd-field")).sendKeys(password);
	//	driver.findElement(By.id("sign-in-btn")).click();
	}

	@Then("^user navigates to Home page$")
	public void user_navigates_to_home_page() throws Throwable {

		System.out.println("inside step-user navigates to Home page");

	}

	@And("^user name is displayed$")
	public void user_name_is_displayed() throws Throwable {

		System.out.println("inside step-user name is displayed with Welcome");
		driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).isDisplayed();



	}
}