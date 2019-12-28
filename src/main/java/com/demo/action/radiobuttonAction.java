package com.demo.action;

import com.demo.locaters.RadiobuttonLocators;


public class radiobuttonAction extends BaseClass {
	RadiobuttonLocators Locators = new RadiobuttonLocators(driver);

	public void enterURL() {
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	}
	
	public void click_on_radio_button()  {
	    // Write code here that turns the phrase above into concrete actions
		Locators.radiobutton.click();
	}

	
	public void click_on_button() {
	    // Write code here that turns the phrase above into concrete actions
		Locators.button.click();
	}


	public void i_validate_the_selction() {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.print("clickedon radio button");

	}

	public void user_enter_valid_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

	}

	public void click_on_second_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
		Locators.radiobutton2.click();
	}   
	
	public void click_on_buttonsec()  {
	    // Write code here that turns the phrase above into concrete actions
		Locators.button2.click();
	}

	public void i_validate_the_selction_of_second_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.print("clickedon radio button2");
	}

	
}
