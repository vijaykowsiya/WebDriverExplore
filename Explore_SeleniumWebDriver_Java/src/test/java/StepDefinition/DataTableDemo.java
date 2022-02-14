package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableDemo {

	WebDriver driver;

	@Given("^User launched HRM app$")
	public void user_launched_HRM_app() throws Throwable {
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		Thread.sleep(6000);
	}

	/*
	 * // With Header - use asMaps()
	 * 
	 * @Given("^User entered Username  and password as below$") public void
	 * user_entered_Username_and_password_as_below(DataTable credList) throws
	 * Throwable {
	 * 
	 * List<Map<String, String>> credentialList = credList.asMaps(String.class,
	 * String.class);
	 * 
	 * String userName = credentialList.get(0).get("userName"); String passWord =
	 * credentialList.get(0).get("passWord");
	 * 
	 * driver.findElement(By.id("txtUsername")).sendKeys(userName);
	 * driver.findElement(By.id("txtPassword")).sendKeys(passWord); }
	 */

	/*
	 * // Without table Header
	 * 
	 * @Given("^User entered Username  and password as below$") public void
	 * user_entered_Username_and_password_as_below(DataTable credentials) throws
	 * Throwable {
	 * 
	 * 
	 * List<String> credentialsAsList = credentials.asList(String.class);
	 * 
	 * String userName = credentialsAsList.get(0); String passWord =
	 * credentialsAsList.get(1);
	 * 
	 * driver.findElement(By.id("txtUsername")).sendKeys(userName);
	 * driver.findElement(By.id("txtPassword")).sendKeys(passWord); }
	 */

	// Without table, when only one test data is passed

	@Given("^User entered \"([^\"]*)\" and \"([^\"]*)\" as below$")
	public void user_entered_Username_as_and_password_as(String userName, String passWord) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);

	}

	@When("^User clicked Login button$")
	public void user_clicked_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	  @Then("^User landed on Home page$") public void user_landed_on_Home_page()
	  throws Throwable {
	  
	  
	  String homePage = driver.findElement(By.id("welcome")).getText();
	  
	  System.out.println(homePage);
	  
	  driver.close();
	  
	  }
	 
	 
	 
	 

}
