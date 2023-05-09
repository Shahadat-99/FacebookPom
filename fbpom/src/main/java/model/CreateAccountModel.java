package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountModel extends BaseModel {
	
	private static final WebElement BirthMonth = null;

	public CreateAccountModel (WebDriver d) {
		super(d);
	}
	
	public WebElement getFirstName () throws InterruptedException {
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//input [@name='firstname']"));
		return a;	
	}
	
	public WebElement getLastName () {
		WebElement b=driver.findElement(By.xpath("//input [@name='lastname']"));
		return b;
	}
	
	public WebElement getMobileOrEmail () {
		WebElement c=driver.findElement(By.xpath("//input [@name='reg_email__']"));
		return c;
	}
	
	public WebElement getConfirmEmail () {
		WebElement d=driver.findElement(By.xpath("//input [@name='reg_email_confirmation__']"));
		return d;
	}
	
	public WebElement getPassword () {
		WebElement e=driver.findElement(By.xpath("//input [@name='reg_passwd__']"));
		return e;
	}
	
	public WebElement getBirthMonth () {
		WebElement f=driver.findElement(By.xpath("//select) [@id='month']"));
		return f;
	}
	
	public WebElement getGender () {
		WebElement j = driver.findElement(By.xpath("(//input) [@value='2']"));
		return j;
	}


}
