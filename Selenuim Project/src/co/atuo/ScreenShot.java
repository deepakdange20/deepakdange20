package co.atuo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh\\Desktop\\A\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	
		
		for(int i=1;i<=5;i++)
		{
			Date d = new Date();
			int sec=d.getSeconds();
			String dd=d.toString().replace(':', '_');
			System.out.println(dd);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest =  new File("D:\\eclipse-workspace\\WebSite\\ScreenShot"+Math.random()
			+".png");
			FileHandler.copy(src, dest);
			System.out.println(sec);
			System.out.println(dd);
			System.out.println(Math.random());
			Thread.sleep(2000);
			
			//FileUtils.copyFile(src, new File("C:\\Users\\Smart\\eclipse-workspace\\Atumation\\ScreenShot\\123.png"));
		//	driver.close();
			
		}
	}

}
