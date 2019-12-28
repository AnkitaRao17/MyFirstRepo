package com.demo.locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowPopUp_locaters {
	WebDriver driver;
	  
	//constructor
	 public WindowPopUp_locaters (WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath ="//a[contains(text(),'Like us On Facebook')]")
	 public WebElement windowpopupbtn; 
	 
	 @FindBy(xpath ="//div[text()='See more of Selenium Easy on Facebook']")
	 public WebElement fcbklink; 
	 
	 
}
