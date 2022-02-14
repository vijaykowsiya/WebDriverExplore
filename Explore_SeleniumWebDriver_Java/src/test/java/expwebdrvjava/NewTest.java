package expwebdrvjava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(Listener.class)
public class NewTest extends ParallelDemo {

	

	
	

	@Test
	public void gmailLogin() {
		// driver.get("http://www.gmail.com");
		Assert.assertEquals(true, false);
	}

	@Test
	public void yahooLogin() {

		// driver.get("http://www.yahoo.com");
		Assert.assertEquals(true, false);

	}
	
	
	@BeforeMethod(groups = "Progression")
	public void setUp_Browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.gmail.com");
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
