package com.demo.action;

import com.demo.locaters.LoginLocators;

public class LoginAction extends BaseClass{
	LoginLocators loginLocators = new LoginLocators(driver);
	
	public void enterURL() {
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	}
	
	public void enterUsername() {
		loginLocators.useranme.sendKeys("Test");
	}
	
	public void clickOnBtn() {
		loginLocators.btn.click();
	}

	public void login() {
	loginLocators.useranme.sendKeys("ankita");
	loginLocators.btn.click();
	
	}
}
