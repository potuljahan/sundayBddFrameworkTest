package bdd.newtours.pageAction;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import bdd.newtours.pageElements.RegisterpageLocators;
import bdd.utilities.ReadExcelSheetData;

public class RegisterRegisterAction {
	
	RegisterpageLocators newtoursRegisterpageLocators = new RegisterpageLocators();

	
public void fillUPContactInfo() throws Exception {
	newtoursRegisterpageLocators.FirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
	newtoursRegisterpageLocators.LaststName.sendKeys("Begum");
	newtoursRegisterpageLocators.Phone.sendKeys("5168084798");
	newtoursRegisterpageLocators.email.sendKeys("mithunbegum@gmail.com");
}

public void fillUPMailingInfo(){
	newtoursRegisterpageLocators.Addressline1.sendKeys("84-27 mail st");
	newtoursRegisterpageLocators.Addressline2.sendKeys("apt#2");
	newtoursRegisterpageLocators.city.sendKeys("new york");
	newtoursRegisterpageLocators.state.sendKeys("ny");
	newtoursRegisterpageLocators.postalCode.sendKeys("01001");
	
	Select mydrpdwn = new Select (newtoursRegisterpageLocators.country);
	mydrpdwn.selectByVisibleText("UNSTATE SITED ");
}
public void fillUPUserInfo(String username){
	newtoursRegisterpageLocators.Username.sendKeys("mithunbegum");
	newtoursRegisterpageLocators.Password.sendKeys("mithun123");
	newtoursRegisterpageLocators.confirmPassord.sendKeys("mithun123");
}

public void submitForm(){
	
	newtoursRegisterpageLocators.SubmitButton.clear();
	
}

}
