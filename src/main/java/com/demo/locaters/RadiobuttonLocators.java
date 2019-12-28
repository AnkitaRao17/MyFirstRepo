package com.demo.locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadiobuttonLocators {
	WebDriver driver;
	  
	//constructor
	 public RadiobuttonLocators (WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//input[@value='Male']")
	 public WebElement radiobutton; 
	 
	 @FindBy(id = "buttoncheck")
	 public WebElement button; 
	 
	 @FindBy(xpath = "//input[@name='ageGroup']")
	 public WebElement radiobutton2; 
	 
	 @FindBy(xpath = "//div/button[text()='Get values']")
	 public WebElement button2; 
	 
}
