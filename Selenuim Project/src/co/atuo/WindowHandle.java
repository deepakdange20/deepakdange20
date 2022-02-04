package co.atuo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		String parewindow=driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		//using set collection
		Iterator<String> it = childwindow.iterator();
		System.out.println(driver.switchTo().window(parewindow).getTitle());;
	
		//switch windows using set collection
		while(it.hasNext())
		{
			String windwo=it.next();
			String pageTitle=driver.switchTo().window(windwo).getTitle();
//			if(pageTitle.contains("OrangeHRM Inc - YouTube"))
//			{
//				driver.switchTo().window(windwo);
//				System.out.println(driver.getTitle());
//			}
			System.out.println(pageTitle);
		}
		
		//using list (Arralist)
		ArrayList<String> arWindwo = new ArrayList<String>(driver.getWindowHandles());
		String w1=arWindwo.get(0);
		String w2 =arWindwo.get(1);
		String w3 =arWindwo.get(2);
		String w4 = arWindwo.get(3);
		String w5 =arWindwo.get(4);
		
		//switch to windows using arraylist 
		driver.switchTo().window(w1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(w2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(w3);
		System.out.println(driver.getTitle());
		driver.switchTo().window(w4);
		System.out.println(driver.getTitle());
		driver.switchTo().window(w5);
		System.out.println(driver.getTitle());
		//close all window keep only parent window
		for(String s: arWindwo)		
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			if(!s.equals(parewindow))
			{
				driver.close();
			}
		}
		
		//to open new blank window 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testng.org/doc/documentation-main.html");
	}

}
