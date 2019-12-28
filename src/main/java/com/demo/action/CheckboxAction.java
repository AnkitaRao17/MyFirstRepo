package com.demo.action;

import com.demo.locaters.CheckboxLocators;

public class CheckboxAction extends BaseClass {
	CheckboxLocators Loc =new CheckboxLocators(driver);
	
	
	public void enter_url_for_checkbox()  {
	    // Write code here that turns the phrase above into concrete actions
		  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");	
	}

	public void click_on_checkbox()  {
	    // Write code here that turns the phrase above into concrete actions
	   Loc.CheckboxF.click();
	}

	public void i_validate_checkbox_selection() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Loc.success.getText());
	}

	public void enter_url_for_checkboxsec() {
	    // Write code here that turns the phrase above into concrete actions
		  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");	
	}
	
	public void click_on_checkbox_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Loc.button.click();
	}

	public void i_validate_checkbox_selection_is_done_for_all_checkbox()  {
	    // Write code here that turns the phrase above into concrete actions
		Loc.success2.isSelected();
	      boolean isSelect3 = Loc.success2.isSelected();
	      System.out.println(isSelect3);
	}

}
