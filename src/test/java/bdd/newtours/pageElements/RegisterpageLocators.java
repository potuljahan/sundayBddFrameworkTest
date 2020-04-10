package bdd.newtours.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterpageLocators {
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement FirstName; 
	
	@FindBy(xpath="//input[@name='laststName']")
	public WebElement LaststName;
	
	@FindBy(xpath="//input[@name='phone']")
	public WebElement Phone;
	
	@FindBy(xpath="//input[@name='userName']")
	public WebElement email;
	
	
	@FindBy(xpath="//input[@name='address1']")
	public WebElement Addressline1;
	
	@FindBy(xpath="//input[@name='address2']")
	public WebElement Addressline2;
	

	@FindBy(xpath="//input[@name='city']")
	public WebElement city ;
	

	@FindBy(xpath="//input[@name='state']")
	public WebElement  state;
	
	@FindBy(xpath="//input[@name='postalCode']")
	public WebElement  postalCode ;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement  Username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement  Password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement  confirmPassord;
	
	@FindBy(xpath="//input[@name='register']")
	public WebElement SubmitButton ;
	
	@FindBy(xpath="//input[@name='country']")
	public WebElement  country ;
	


	
}
