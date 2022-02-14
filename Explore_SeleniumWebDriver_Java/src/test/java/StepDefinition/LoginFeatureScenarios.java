package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureScenarios {
	
	WebDriver driver;
	
	@Given("^User is on Google Home page$")
	public void user_is_on_Google_Home_page() throws Throwable {
		
	    driver = new ChromeDriver();
	    
	    driver.get("http://www.google.co.in");
	    
	    Thread.sleep(6000);
	    
	}

	@When("^Enter keyword \"(.*)\" and Submit$")
	public void enter_keyword_and_Submit(String searchVal) throws Throwable {
	   
	    driver.findElement(By.name("q")).sendKeys(searchVal + Keys.ENTER);
	    Thread.sleep(6000);

	}

	@Then("^Search Results of Selenium should display$")
	public void m1() throws Throwable {
	   
	WebElement result = driver.findElement(By.xpath("//*[contains(text(),'About')]"));
		
		System.out.println(result.getText());
	   
	}
	
	@Given("^the account balance is Rs (\\d+.\\d+)$")
	public void the_account_balance_is_Rs(float arg2) throws Throwable {
	   
		System.out.println(arg2);
	    
	}

	@When("^the user withdraws Rs (\\d+)$")
	public void the_user_withdraws_Rs(int arg1) throws Throwable {
	    
		System.out.println(arg1);
	}

	@Then("^the account balance should be Rs (\\d+\\.\\d+)$")
	public void the_account_balance_should_be_Rs(float arg2) throws Throwable {
		System.out.println(arg2);
	}

}
