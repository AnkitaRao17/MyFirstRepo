package com.demo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WindowPopUpStep {
	com.demo.action.WindoPopUp_Action WindoPopUp_Action  = new com.demo.action.WindoPopUp_Action();
	
	@Given("^Enter url for window pop up handles$")
	public void enter_url_for_window_pop_up_handles() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^Click on button to open window popup$")
	public void click_on_button_to_open_window_popup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^Switch to particular child popup window$")
	public void switch_to_particular_child_popup_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("^I validate the correct child pop up window should be opened$")
	public void i_validate_the_correct_child_pop_up_window_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}


	
}
