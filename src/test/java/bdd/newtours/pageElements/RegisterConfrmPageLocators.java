package bdd.newtours.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterConfrmPageLocators {
	@FindBy(xpath="//font[contains(text(),'Thank you for registering.')]")
	public WebElement  TxtThankYou;
	

}
