package com.demo.steps;

import com.demo.action.LoginAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	LoginAction loginAction = new LoginAction();
	
	@Given("^user enter url$")
	public void user_enter_url(){
		loginAction.enterURL();
		
		System.out.println("hiii");
	}

	@When("^user enter username$")
	public void user_enter_username() {
		loginAction.enterUsername();
	}

	@When("^user clicks on login btn$")
	public void user_clicks_on_login_btn() {
		loginAction.clickOnBtn();
	}
	
	@Then("^message should be displayed$")
	public void message_should_be_displayed() {
		System.out.println("displayed");
	}
}
