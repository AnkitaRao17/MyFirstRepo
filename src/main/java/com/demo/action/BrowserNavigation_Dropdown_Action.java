package com.demo.action;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.demo.locaters.BrowserNavigation_Dropdown_Locaters;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserNavigation_Dropdown_Action extends BaseClass {
	BrowserNavigation_Dropdown_Locaters loc =new BrowserNavigation_Dropdown_Locaters(driver);
	 
	  public void enter_url_for_browser_navigation() throws Throwable {
	  driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html ");
	 
	  }
	 
	   public void navigate_to_another_url()
	  throws Throwable { Thread.sleep(2000);
	 driver.navigate().to("http://www.google.com");
	 }
	 
	
	 public void navigate_to_backward() throws Throwable { driver.navigate().back(); }
	 
      public void navigate_to_refresh() throws
	 Throwable { driver.navigate().refresh(); }
	 
	  public void i_validate_the_backward_navigation() throws Throwable { String Url =
	 driver.getCurrentUrl(); System.out.println(Url); String Url1 =
	  driver.getTitle(); System.out.println(Url1);
	  }
	
	  public void enter_url_for_Forward_browse_navigation() throws Throwable {
	 driver.navigate().to("http://www.google.com"); }
	 
	  public void navigate_to_forward() {
		  driver.navigate().forward();
	        }
	
	 public void i_validate_the_Forward_navigation() { String Url = driver.getCurrentUrl();
        System.out.println(Url); }
	 
	  public void
	 enter_url_for_Dropdown_selection() { driver.get(
	  "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	 
	  }
	  
	  public void select_option_from_dropdownlist() { 
		 Select SD = new Select(loc.Dropdownf);
		  SD.selectByIndex(1); 
	 }
	  
	  public void verify_select_option_from_dropdownlist() { 
			 Select SD = new Select(loc.Dropdownf);
			  WebElement wb = SD.getFirstSelectedOption();
			  System.out.println(wb.getText());
		 }
	
	 public void getting_all_option_from_dropdownlist() { 
		 
	  Select SD3 = new Select(loc.Dropdownf);
	 List<WebElement> allOptions =SD3.getAllSelectedOptions(); 
	 for(WebElement option: allOptions) 
	 { 
		 System.out.print(option.getText());
		 }
  }
		
	
}
