package test;

import org.testng.annotations.Test;

public class CreateAccountPageTest extends baseTest {
	@Test
	public void CreateAccountPageTest () throws InterruptedException {
		GetHomePage();
		hp.clickOnButton();
		
		getCreateAccountPage();
		dell.typeFirstName ("Shahadat");
		
		getCreateAccountPage();
		dell.typeLastName ("Ali");
		
		getCreateAccountPage();
		dell.typeMobileOrEmail ("asirebhaiasi@gmail.com");
		
		getCreateAccountPage();
		dell.typeConfirmEmail ("asirebhaiasi@gmail.com");
		
		getCreateAccountPage();
		dell.typePassword("hellohellohello");
		
		getCreateAccountPage ();
		dell.clickGender(null);
		
	}
	
	
	

}
