package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CommonHooks {

	@BeforeStep
	public void setUp() {
		  System.out.println("setUp");
		}
	@Before  
	public void setUpBrowsers() {
		  System.out.println("setUpBrowsers");
		}
	@Before ("@Regression")
	public void urlSetUp() {
		  System.out.println("urlSetUp");
		}
	
	@AfterStep  
	public void browserClose() {
		 System.out.println("browserClose");
		}
	
	@After  
	public void browser() {
		 System.out.println("browser");
		}
	
	@After ("@Regression")
	public void takesScreenshot() {
		 System.out.println("takesScreenshot");
		}
	
}
