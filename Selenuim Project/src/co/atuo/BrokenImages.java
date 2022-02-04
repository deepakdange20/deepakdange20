package co.atuo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in/");
		
		List<WebElement> list=driver.findElements(By.tagName("img"));
		for (int i = 0; i < list.size(); i++) 
		{
			
				if(	list.get(i).getAttribute("src")==null || list.get(i).getAttribute("src").isEmpty())
				{
					System.out.println("image is Broken");
				}
				else
				{
					System.out.println(list.get(i).getAttribute("src")+"Image is valid");
				}
		}
	//	System.out.println(list.size());
		//System.out.println(list.get(0).getAttribute("src"));
	}

}
