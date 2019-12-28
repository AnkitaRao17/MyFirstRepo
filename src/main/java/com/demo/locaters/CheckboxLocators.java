package com.demo.locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class CheckboxLocators extends BaseClass {
	WebDriver driver;
	  
	//constructor
	 public CheckboxLocators (WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id= "isAgeSelected")
	 public WebElement CheckboxF; 
	 
	 @FindBy(id="txtAge")
	 public WebElement success; 
	 
	 @FindBy(id="check1")
	 public WebElement button; 
	 
	 @FindBy(xpath="//label[text()='Option 4']/input")
	 public WebElement success2;
	 

}
