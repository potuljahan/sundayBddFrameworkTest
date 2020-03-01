package bdd.utilities;

import cucumber.api.java.After;

public class AfterAction {
	
	@After
	public void afterAction(){

		SetupDrivers.tearDownDriver();

		System.out.println("----------");

	}

}
