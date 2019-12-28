package com.demo.steps;

import com.demo.action.LoginAction;
import com.demo.action.radiobuttonAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Radiobtton {
	radiobuttonAction Action = new radiobuttonAction();

	@Given("^user enter valid url$")
	public void user_enter_valid_url1() {
	    // Write code here that turns the phrase above into concrete actions
		Action.enterURL();
	}

	@When("^click on radio button$")
	public void click_on_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Action.click_on_radio_button();
	}

	@When("^click on button$")
	public void click_on_button() {
	    // Write code here that turns the phrase above into concrete actions
		Action.click_on_radio_button();
	}

	@Then("^I validate the selction$")
	public void i_validate_the_selction() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Action.i_validate_the_selction();
	}

	@Given("^user enter valid  url$")
	public void user_enter_valid_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Action.enterURL();
	}

	@When("^click on second radio button$")
	public void click_on_second_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Action.click_on_second_radio_button();
	}

	@When("^click on buttonsec$")
	public void click_on_buttonsec() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Action.click_on_buttonsec();
	}

	@Then("^I validate the selction of second radio button$")
	public void i_validate_the_selction_of_second_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Action.i_validate_the_selction_of_second_radio_button();
	}
}
