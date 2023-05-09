package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbHomeModel extends BaseModel {
	
	public fbHomeModel (WebDriver d) {
		super(d);
	}
	
	public WebElement GetButton () {
		WebElement s=driver.findElement(By.xpath("//a [text() ='Create new account']"));
		return s;
	}
	


}
