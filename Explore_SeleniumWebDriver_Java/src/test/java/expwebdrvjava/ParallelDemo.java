package expwebdrvjava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ParallelDemo  {
	
	 public static WebDriver driver;
				 
		  public void takesScreenshotOnFailure(String screenshotName) throws IOException
			{
				  TakesScreenshot ss = (TakesScreenshot) driver;
				  
				  File screenshot = ss.getScreenshotAs(OutputType.FILE);
				  
				  File screenshotPath = new File("C:\\Users\\User\\eclipse-workspace\\expwebdrvjava\\Screenshots\\"+screenshotName + ".png");
				  
				FileUtils.copyFile(screenshot, screenshotPath);
				
				System.out.println("screenshot method called");
				
				 

				// FileHandler.copy(screenshot, screenshotPath);
			}
			
}
