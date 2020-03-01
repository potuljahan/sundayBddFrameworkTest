package bdd.newtours.pageAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import bdd.newtours.pageElements.HomepageLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;


public class NewtoursHomePageAction {
	HomepageLocators newtoursHomepageLocators = new HomepageLocators ();
	
public void launchNewtoursHomepage() throws Exception{
	System.out.println(ReadExcelSheetData.getMapData("FirstName"));
    SetupDrivers.driver.get("http://newtours.demoaut.Com/");
	SetupDrivers.driver.manage().window().maximize();
	SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}	

public void NavigateToRegisterpage(){
	newtoursHomepageLocators.RegisterButton.click();
}
}
