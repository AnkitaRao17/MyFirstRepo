package com.demo.steps;

import com.demo.action.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks {
    BaseClass initClass= new BaseClass();
	/*
	 * @Before(order=0) public void initDriver() { System.out.println("In Before");
	 * }
	 * 
	 * @Before(order=1) public void initDriver1() { System.out.println("In Befor2");
	 * }
	 * 
	 * @After(order=1) public void cleanUp() { System.out.println("In After"); }
	 * 
	 * @After(order=0) public void cleanUp1() { System.out.println("In After2"); }
	 */
	
	/*
	 * @Before("@sanity") public void initDB() { System.out.println("In befor DB");
	 * }
	 * 
	 * @After("@sanity") public void closeDB() { System.out.println("In after DB");
	 * }
	 */
	
	@Before
	public void initDriver() {
		initClass.beforeMethod();
	}
	
	@After
	public void closeDriver() {
		initClass.afterMethod();
	}
}
