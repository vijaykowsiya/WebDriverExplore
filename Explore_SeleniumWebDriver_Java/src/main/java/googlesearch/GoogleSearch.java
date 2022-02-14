package googlesearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
 
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
