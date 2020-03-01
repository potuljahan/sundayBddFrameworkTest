package bdd.stepDef;

import bdd.newtours.pageAction.NewtoursHomePageAction;
import bdd.newtours.pageAction.RegisterRegisterAction;
import bdd.newtours.pageAction.RegisterConfPageAction;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegister {
	 NewtoursHomePageAction homePageaction = new  NewtoursHomePageAction();
	 RegisterRegisterAction newtowrRegisterConfrPageAction = new RegisterRegisterAction();
	 RegisterConfPageAction  registerPageActionobj = new  RegisterConfPageAction ();
	
	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		homePageaction.launchNewtoursHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		homePageaction.NavigateToRegisterpage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newtowrRegisterConfrPageAction.fillUPContactInfo();
		newtowrRegisterConfrPageAction.fillUPMailingInfo();		
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName) throws Throwable {
		newtowrRegisterConfrPageAction.fillUPUserInfo(UserName);
		newtowrRegisterConfrPageAction.submitForm();
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {

		registerPageActionobj.verifyThankyouRegister();
	}



}
