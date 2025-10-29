package stepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    //driver.get("https://www.google.com/");

	}
	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	   driver.navigate().to("https://www.google.com/"); 
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
	    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation Step by Step");
	    Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		driver.getPageSource().contains("Pricing & plans");
		
		driver.close();
	}
}
