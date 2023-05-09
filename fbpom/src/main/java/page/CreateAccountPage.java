package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateAccountModel;
import model.fbHomeModel;

public class CreateAccountPage extends CreateAccountModel {
	public CreateAccountPage (WebDriver e) {
	super(e);
		
	}
	
	public void typeFirstName (String firstname) throws InterruptedException {
	WebElement g= getFirstName();
	g.sendKeys(firstname);	
	}
	
	public void typeLastName (String lastname) {
		WebElement h= getLastName();
		h.sendKeys (lastname);
	}
	
	public void typeMobileOrEmail (String mobileoremail) {
		WebElement i=getMobileOrEmail();
		i.sendKeys(mobileoremail);
	}
	
	public void typeConfirmEmail (String confirmemail) {
		WebElement j=getConfirmEmail();
		j.sendKeys(confirmemail);
	}
	
	public void typePassword (String password) {
		WebElement k=getPassword();
		k.sendKeys (password);
	}
	
	//public void typeBirthMonth (String BirthMonth) {
		//Select g = new Select (BirthMonth);
		//g.selectByVisibleText("Jul");
	//}
	
	
	public void clickGender (String Gender) {
		WebElement m=getGender();
		m.click();
	}


}
