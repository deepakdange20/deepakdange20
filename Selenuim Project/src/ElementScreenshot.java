import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ElementScreenshot {
      static WebDriver driver;
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
       WebElement  textBox =  driver.findElement(By.id("autocomplete"));
        
      File srcFile =  textBox.getScreenshotAs(OutputType.FILE);
      
      File DestFile=new File("D:\\Selenuim\\box.png");

      //Copy file at destination

//      try {
//		//FileUtils.copyFile(srcFile, DestFile);
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}
	}
	  

}
