package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	 
	 @FindBy (id = "input-email") WebElement txt_username;
	 @FindBy (id = "input-password")WebElement txt_password;
	 @FindBy (xpath ="//button[@class='btn btn-primary btn-lg hidden-xs']") WebElement btn_login;
	
	
	
	

	public void enterUsername(String u) {
		
		txt_username.sendKeys(u);
	}
	public void enterPassword(String p) {
		txt_password.sendKeys(p);
	}
	public void clickLogin() {
		btn_login.click();
	}
}
