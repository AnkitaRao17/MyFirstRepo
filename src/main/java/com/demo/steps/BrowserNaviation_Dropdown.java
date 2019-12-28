package com.demo.steps;

import com.demo.action.BrowserNavigation_Dropdown_Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserNaviation_Dropdown {
	BrowserNavigation_Dropdown_Action Act = new BrowserNavigation_Dropdown_Action();
	
	@Given("^enter url for browser navigation$")
	public void enter_url_for_browser_navigation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^Navigate to another url$")
	public void navigate_to_another_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^navigate to backward$")
	public void navigate_to_backward() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^navigate to refresh$")
	public void navigate_to_refresh() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^I validate the backward navigation\\.$")
	public void i_validate_the_backward_navigation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("^enter url for Forward browse navigation$")
	public void enter_url_for_Forward_browse_navigation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^navigate to forward$")
	public void navigate_to_forward() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^I validate the Forward navigation\\.$")
	public void i_validate_the_Forward_navigation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^enter url for Dropdown selection$")
	public void enter_url_for_Dropdown_selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^select option from dropdownlist\\.$")
	public void select_option_from_dropdownlist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.select_option_from_dropdownlist();
	}

	@Then("^I validate the correct option selection\\.$")
	public void i_validate_the_correct_option_selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^Getting all  option from dropdownlist\\.$")
	public void getting_all_option_from_dropdownlist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.getting_all_option_from_dropdownlist();
	}

	@Then("^I validate the option selection\\.$")
	public void i_validate_the_option_selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Act.verify_select_option_from_dropdownlist();
	}


}
