import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching sample website
		driver.get("https://www.google.com/search?q=covid+19+cases+in+india&sxsrf=AOaemvJPkaktNkgfa9qbODX_YZbYpMEYMA%3A1632728728156&ei=mHZRYYv3CJDbz7sP4uyYqAE&oq=covid+19+casesm+in+&gs_lcp=Cgdnd3Mtd2l6EAMYADIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDToECCMQJzoFCAAQkQI6CAgAEMkDEJECOgUIABCSAzoLCAAQgAQQsQMQgwE6BQgAEIAEOg4IABCxAxCDARDJAxCRAjoHCAAQChCRAjoLCAAQsQMQgwEQkQI6CggAELEDEIMBEAo6BwgAELEDEAo6BAgAEApKBAhBGABQrQJYxxZg-05oAHABeACAAcoDiAG4KZIBBzItMy43LjWYAQCgAQHAAQE&sclient=gws-wiz");
		driver.manage().window().maximize();
		String xpath="(//*[local-name()='svg' and @class='uch-psvg'])[1]//*[name()='rect']";
		
		List<WebElement> asList= driver.findElements(By.xpath(xpath));
		System.out.println(asList);
		Actions action = new Actions(driver);
		for(WebElement e : asList)
		{
			action.moveToElement(e).perform();
			String tooltip = driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
			System.out.println(tooltip);
			
		}
			
		
		
	}

}
