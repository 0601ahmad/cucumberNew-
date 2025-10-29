package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps{
WebDriver driver=null;
	loginPage login;
	
	@Given("browser is open now")
	public void browser_is_open_now() {
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	@And("user is on login page now")
	public void user_is_on_login_page_now() {
	    driver.navigate().to("https://www.opencart.com/index.php?route=account%2Flogin&ld=APUKLPADirect");
	}

	@When("user enters(.*) and (.*)$")
	public void user_enters_username_and_password_after(String username, String password) throws InterruptedException {
		login = new loginPage(driver);
		login.enterUsername(username);
		   Thread.sleep(2000);

		login.enterPassword(password);
	  
	   Thread.sleep(2000);
	}
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login = new loginPage(driver);
		login.clickLogin();
	   Thread.sleep(2000);
	}

	@Then("user is navigated to the home page now")
	public void user_is_navigated_to_the_home_page_now() {
	   
		driver.close();
	}
}
