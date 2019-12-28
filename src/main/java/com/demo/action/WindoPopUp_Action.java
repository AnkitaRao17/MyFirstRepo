package com.demo.action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.locaters.WindowPopUp_locaters;

public class WindoPopUp_Action extends BaseClass {
	WindowPopUp_locaters WindowPopUp_locaters = new WindowPopUp_locaters(driver);

	public void enter_url_for_window_pop_up_handles() {
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		String parentid = driver.getWindowHandle();
	}

	public void click_on_button_to_open_window_popup() {

		WindowPopUp_locaters.windowpopupbtn.click();
	}
	
	public void switch_to_particular_child_popup_window() {
		Set<String> childid = driver.getWindowHandles();
		  for (String childwin :childid ) {
			  String title = driver.switchTo().window(childwin).getTitle();
			  if(title.contains("Facebook")) {
				  break;
			  }
		  }
	}
	
	public void i_validate_the_correct_child_pop_up_window_should_be_opened() {
		 driver.manage().window().maximize();
		 WindowPopUp_locaters.fcbklink.click();
		 System.out.println("child window is opened successfully");
	}

}
