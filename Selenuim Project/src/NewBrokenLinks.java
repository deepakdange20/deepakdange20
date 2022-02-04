import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        driver.manage().window().maximize();
      
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.addAll(driver.findElements(By.tagName("img")));
        System.out.println(allLinks.size());
        
        List<String> links = new ArrayList<String>();
        
        for(WebElement e: allLinks)
        {
        	String realLinks =e.getAttribute("href");
        	links.add(realLinks);
        	//getUrls(link);
        }
        links.parallelStream().forEach(e->getUrls(e));
	}





	public static void getUrls(String urls) 
	{
		URL url=null;
		try {
			
			url = new URL(urls);
			HttpURLConnection connection =(HttpURLConnection) url.openConnection();
			connection.connect();
			if(connection.getResponseCode()>=400)
			{
				System.out.println(urls +"......"+ connection.getResponseMessage());
			}
			else
			{
				System.out.println(urls+"......"+ connection.getResponseMessage());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
	}
}