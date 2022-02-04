import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh\\Desktop\\A\\chromedriver.exe");
		
        //Instantiating driver object
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("newWindowBtn")).click();
     
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        
        Set<String> childWindow = driver.getWindowHandles();
        System.out.println(childWindow);
        
         Iterator<String> it = childWindow.iterator();
     
         while(it.hasNext())
         {
        	 String window = it.next();
        	 if(!parentWindow.equals(window))
        	 {
        		 driver.switchTo().window(window);
        		 System.out.println("SessionID is :"+driver.switchTo().window(window));
        		 String  urlTitle = driver.switchTo().window(window).getTitle();
        		 driver.findElement(By.id("firstName")).sendKeys("Deepak");
        		 driver.close();
        		 
        		 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 
        		 System.out.println(urlTitle);
        		
        	 }
         }
        
         driver.switchTo().window(parentWindow);
         driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
         System.out.println("Parent Window Title:"+driver.getTitle());
         driver.quit();
	}
	

}
