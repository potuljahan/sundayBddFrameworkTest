package bdd.newtours.pageAction;

import bdd.newtours.pageElements.RegisterConfrmPageLocators;
import junit.framework.Assert;

public class RegisterConfPageAction {
	RegisterConfrmPageLocators registerConfrmPageLocatorsobj = new RegisterConfrmPageLocators ();


public void verifyThankyouRegister(){
	String confMsg = registerConfrmPageLocatorsobj.TxtThankYou.getText();
	Assert.assertEquals(confMsg, "Thank you for registering.you may now sing-in the user name and password");
}
}