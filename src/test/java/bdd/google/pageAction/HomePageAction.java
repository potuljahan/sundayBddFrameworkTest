package bdd.google.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.google.pageElements.GoogleHomepageLocators;

import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class HomePageAction {
	GoogleHomepageLocators GoogleHomepageLocatorsobj ;
	
	public HomePageAction (){
		GoogleHomepageLocatorsobj = new GoogleHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, GoogleHomepageLocatorsobj);
		
	}
	
	
		public void launchHomePageAction(){
	
	    SetupDrivers.driver.get("https://www.google.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
		

		public void SearchByKeyword (String Keyword) throws Exception{
			
			Thread.sleep(5000);
		
			GoogleHomepageLocatorsobj.Keyword.sendKeys(Keyword);
			GoogleHomepageLocatorsobj.Searchbox.click();

}
}