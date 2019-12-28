package com.demo.steps;

import com.demo.action.CheckboxAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckboxSteps {
	CheckboxAction Act =new CheckboxAction();

	@Given("^enter url for checkbox$")
	public void enter_url_for_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.enter_url_for_checkbox();
	}

	@When("^click on checkbox$")
	public void click_on_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.click_on_checkbox();
	}

	@Then("^I validate checkbox selection$")
	public void i_validate_checkbox_selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.i_validate_checkbox_selection();
	}

	@Given("^enter url for checkboxsec$")
	public void enter_url_for_checkboxsec() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.enter_url_for_checkboxsec();
	}
	
	@When("^click on checkbox button$")
	public void click_on_checkbox_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.click_on_checkbox_button();
	}

	@Then("^I validate checkbox selection is done for all checkbox\\.$")
	public void i_validate_checkbox_selection_is_done_for_all_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.i_validate_checkbox_selection_is_done_for_all_checkbox();
	}


}
