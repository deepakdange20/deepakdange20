


	import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.interactions.Actions;

	public class MouseHandle {
		
		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Launching sample website
			driver.get("https://artoftesting.com/samplesiteforselenium");
			driver.manage().window().maximize();
			
			//Mouseover on submit button
			Actions action = new Actions(driver);
			WebElement btn = driver.findElement(By.linkText("Manual"));
			action.moveToElement(btn).perform();
			//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(scrFile, new File("D:\\testScreenShot.jpg"));
			
			//Thread.sleep just for user to notice the event
			Thread.sleep(3000);
			WebElement a = driver.findElement(By.linkText("Automation"));
			action.moveToElement(a).build().perform();
			//Closing the driver instance
			//driver.quit();
		}	
		
	
	

}
