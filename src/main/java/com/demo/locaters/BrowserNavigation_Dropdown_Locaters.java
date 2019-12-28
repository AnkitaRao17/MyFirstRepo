package com.demo.locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class BrowserNavigation_Dropdown_Locaters extends BaseClass {
	WebDriver driver;
	  
	//constructor
	 public BrowserNavigation_Dropdown_Locaters (WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id= "select-demo")
	 public WebElement Dropdownf; 

	 
}
