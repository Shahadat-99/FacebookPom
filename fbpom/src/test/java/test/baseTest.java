package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateAccountPage;
import page.fbHomePage;

public class baseTest {
	static WebDriver driver;
	static fbHomePage hp;
	static CreateAccountPage dell;
	
		
	@BeforeSuite
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		
	}
	
	public void GetHomePage () {
		hp=new fbHomePage (driver);
	}
	
	public void getCreateAccountPage () {
		dell=new CreateAccountPage (driver);
	}
	
	
	
	
	
	

}
