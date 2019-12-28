package com.demo.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registerstep {

	@When("^enter firstname$")
	public void enter_firstname() {
		System.out.println("user enter firstname");
	}

	@When("^enter lastname$")
	public void enter_lastname() {
		System.out.println("user enter lastname");
	}

	@When("^enter DOB$")
	public void enter_DOB() throws Throwable {
		System.out.println("user enter DOB");
	}

	@When("^enter country$")
	public void enter_country() throws Throwable {
		System.out.println("user enter country");
	}

	@When("^enter state$")
	public void enter_state() throws Throwable {
		System.out.println("user enter state");
	}

	@Then("^registration successfully page should be displayed$")
	public void registration_successfully_page_should_be_displayed() {
		System.out.println("registration successfully page should be displayed");
	}

	@When("^enter firstname \"([^\"]*)\"$")
	public void enter_firstname(String firstname) {
		System.out.println("firstname" + firstname);
		
	}

	@When("^enter lastname \"([^\"]*)\"$")
	public void enter_lastname(String lastname) {
		System.out.println("lastname" + lastname);

	}

	@When("^enter DOB \"([^\"]*)\"$")
	public void enter_DOB(String DOB) {
		System.out.println("DOB" + DOB);

	}

	@When("^enter country\"([^\"]*)\"$")
	public void enter_country(String country) {
		System.out.println("country" + country);
	}

	@When("^enter state\"([^\"]*)\"$")
	public void enter_state(String state) {
		System.out.println("state" + state);
	}
	
	@Given("^user invoke browser$")
	public void user_invoke_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hii");
	}

}
