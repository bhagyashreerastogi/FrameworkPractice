package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {

	@FindBy(id="login-email-field")
	WebElement txt_username; 
	
	@FindBy(id="login-pwd-field")
	WebElement txt_password;
	
	@FindBy(id="sign-in-btn")
	WebElement btn_login;
	
	@FindBy(partialLinkText="sample")
	List<WebElement> myLinks;
	
	WebDriver driver;
	
	public loginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, loginPage_PF.class);
		
		if(driver.getTitle().equals("FCA Fleet - Vehicles for Business")) {
			
			throw new IllegalStateException("This is not home page.The current page is"
		+driver.getCurrentUrl());
		}
		
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
		System.out.println("user entered username from LoginPage_PF class");
		
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
		System.out.println("user entered password from LoginPage_PF class");
	}
	public void clickLoginButton() {
		btn_login.click();
		System.out.println("user clicked on Login button from LoginPage_PF class");
	}
	
}
