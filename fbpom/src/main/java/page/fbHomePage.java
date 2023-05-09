package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.fbHomeModel;

public class fbHomePage extends fbHomeModel {
	public fbHomePage (WebDriver e) {
	super(e);
		
	}
	
	public void clickOnButton () {
	WebElement g=GetButton();
	g.click();
		
		
	}


}
