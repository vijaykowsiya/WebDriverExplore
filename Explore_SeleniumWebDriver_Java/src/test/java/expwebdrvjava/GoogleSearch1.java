package expwebdrvjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
