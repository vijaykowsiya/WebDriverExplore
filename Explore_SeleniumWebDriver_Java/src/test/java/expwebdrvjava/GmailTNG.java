package expwebdrvjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTNG extends Listener {
	WebDriver driver;
	// HTMLReporter reporter = new HTMLReporter("report.html");

	@BeforeMethod(groups = "Progression")
	public void setUp_Browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	/*
	 * @Test(priority = 0, groups = "Progression")
	 * 
	 * @Parameters({ "userName", "passWord", "url" })
	 * 
	 * public void gmailLogin(String userName, String passWord, String url) {
	 * 
	 * driver.get(url);
	 * 
	 * // Assert.assertEquals(userName, "Besant", "UserName is mismatching");
	 * 
	 * 
	 * SoftAssert softAssert = new SoftAssert();
	 * 
	 * softAssert.assertEquals(userName, "Besant"); System.out.println("User name "
	 * + userName);
	 * 
	 * System.out.println("Password " + passWord);
	 * 
	 * }
	 */

	@Test(priority = 1, groups = { "Progression", "Regression" })
	public void yahooLogin() {

		driver.get("http://www.yahoo.com");

	}

	@Test(priority = 2)
	public void bingLogin() {

		// driver.get("http://www.bing.com");

		System.out.println(10 / 0);

	}
	/*
	 * @Test(priority = 3) public void faceBookLogin() {
	 * 
	 * driver.get("http://www.facebook.com");
	 * 
	 * }
	 * 
	 * @Test(priority = 4) public void googleLaunch() {
	 * 
	 * driver.get("http://www.google.com");
	 * 
	 * }
	 * 
	 * @Test(priority = 5) public void twitterLogin() {
	 * 
	 * driver.get("http://www.twitter.com");
	 * 
	 * }
	 * 
	 * @Test(priority = 6) public void amazonLogin() {
	 * 
	 * driver.get("http://www.amazon.com");
	 * 
	 * }
	 * 
	 * @Test(priority = 7) public void flipKartLogin() {
	 * 
	 * driver.get("http://www.flipkart.com");
	 * 
	 * }
	 * 
	 * 
	 * @AfterMethod (groups="Progression") public void tearDown() { driver.close();
	 * }
	 */

}
