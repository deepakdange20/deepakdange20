import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMovment {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        //Using get() method to open a webpage
        try {
			driver.get("https://vctcpune.com/selenium/practice.html");
			js.executeScript("window.scrollBy(0,500)", "");
			//driver.findElement(By.xpath("//a[contains(text(),'Click to Start Selenium Practice Now')]")).click();
			Thread.sleep(10000);
			
			//driver.navigate().to("https://vctcpune.com/selenium/practice.html");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[contains(@value,'Radio2')]")).click();
	   // Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("I am good with 10 lack package");
	   Thread.sleep(3000);
	   Select select= new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
	   select.selectByVisibleText("Option1");
	   Thread.sleep(3000);
	   js.executeScript("window.scrollBy(0,1000)", "");
	   driver.findElement(By.xpath("//input[@id='checkBoxOption3' and @name='checkBoxOption3']")).click();
	   //Thread.sleep(3000);
	  // driver.findElement(By.xpath("//a[@id='opentab']")).click();
	  //.navigate().back();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@id='name' and @name='enter-name']")).sendKeys("Deepak");
	   driver.findElement(By.id("alertbtn")).click();
	   
	   driver.switchTo().alert().accept();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@id='name' and @name='enter-name']")).sendKeys("Deepak");
	   driver.findElement(By.id("confirmbtn")).click();
	   driver.switchTo().alert().dismiss();
	   
	   Thread.sleep(3000);
	   
  
			
      System.out.println("mouseover");
      Actions action=new Actions(driver);
      WebElement menLink = driver.findElement(By.id("mousehover"));
      action.moveToElement(menLink).build().perform();
      js.executeScript("window.scrollBy(0,1700)", "");
      Thread.sleep(3000);
  
      driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click(); 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//a[contains(text(),'Reload')]")).click();
      
      System.out.println("Top");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        
        //Closing the browser
       // driver.quit();
 
    }
 
}