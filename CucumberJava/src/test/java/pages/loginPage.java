package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	By txt_username=By.id("login-email-field");
	By txt_password=By.id("login-pwd-field");
	By btn_login=By.id("sign-in-btn");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		
		if(driver.getTitle().equals("FCA Fleet - Vehicles for Business")) {
			
			throw new IllegalStateException("This is not home page.The current page is"
		+driver.getCurrentUrl());
		}
		
	}
	
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLoginButton() {
		driver.findElement(btn_login).click();
	}
}