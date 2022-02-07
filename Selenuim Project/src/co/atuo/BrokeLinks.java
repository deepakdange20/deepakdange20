package co.atuo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokeLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	List<WebElement> links=	driver.findElements(By.xpath("//a"));
	
	System.out.println(links.size());

	for(int i=0; i<links.size();i++)
	{
		WebElement web = links.get(i);

		String link = web.getAttribute("href");
		System.out.println(link);
		
		URL url= new URL(link);
		HttpURLConnection httpco= (HttpURLConnection) url.openConnection();
		Thread.sleep(2000);
		httpco.connect(); //establish connection
		int respcode =httpco.getResponseCode();
	//	System.out.println(respcode);
		if(respcode<=400)
		{
		System.out.println(httpco.getResponseMessage());
		}
		else
		{
			System.out.println(httpco.getResponseMessage());
		}
	
	}
	
	
	}

}
