import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenuim\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        driver.manage().window().maximize();
      
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        linkList.addAll(driver.findElements(By.tagName("img")));
        System.out.println(linkList.size());
        
        List<String> Links = new ArrayList<String>();
        
        for(int i=0; i<linkList.size();i++)
        {
        	String realLinks =  linkList.get(i).getAttribute("href");
        	Links.add(realLinks);
        	
        }
        
        for(int j=0; j<Links.size(); j++)
        {
        	HttpURLConnection connection =(HttpURLConnection) new URL(Links.get(j)).openConnection();
        	connection.connect();
        	String response = connection.getResponseMessage();
        	connection.disconnect();
        	System.out.println(Links.get(j)+"....."+response);
        	
        }

	}

}
