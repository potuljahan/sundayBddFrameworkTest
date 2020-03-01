package bdd.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class BeforeAction {
	
	@Before
	public void beforeAction(Scenario scen){

		System.out.println(">> Initializing Chrome Driver");

		SetupDrivers.setupDriver();

		System.out.println(scen.getName());

		

	}

}
