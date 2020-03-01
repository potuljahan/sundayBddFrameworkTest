package bdd.google.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomepageLocators {

	@FindBy(xpath="//input[@title='Search']")
	public WebElement Keyword;
	
	@FindBy(xpath="//input[@value='Google Search']")
	public WebElement Searchbox;
}
