package bdd.stepDef;

import bdd.google.pageAction.HomePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch {
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		homePageAction.launchHomePageAction();
	}

	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String Keyword) throws Throwable {
		homePageAction.SearchByKeyword(Keyword);
	    	}

	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
		   System.out.println("Verify search result appear");
	}

}
