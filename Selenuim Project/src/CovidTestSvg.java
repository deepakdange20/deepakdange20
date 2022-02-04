import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CovidTestSvg {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching sample website
		driver.get("https://www.google.com/search?q=covid+19+cases+in+india&sxsrf=AOaemvJPkaktNkgfa9qbODX_YZbYpMEYMA%3A1632728728156&ei=mHZRYYv3CJDbz7sP4uyYqAE&oq=covid+19+casesm+in+&gs_lcp=Cgdnd3Mtd2l6EAMYADIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDToECCMQJzoFCAAQkQI6CAgAEMkDEJECOgUIABCSAzoLCAAQgAQQsQMQgwE6BQgAEIAEOg4IABCxAxCDARDJAxCRAjoHCAAQChCRAjoLCAAQsQMQgwEQkQI6CggAELEDEIMBEAo6BwgAELEDEAo6BAgAEApKBAhBGABQrQJYxxZg-05oAHABeACAAcoDiAG4KZIBBzItMy43LjWYAQCgAQHAAQE&sclient=gws-wiz");
		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[2]"));
		int getTopLeftY = ((ele.getSize().getHeight())/2)- ele.getSize().getHeight();
		int getTopLeftX = ((ele.getSize().getWidth())/2)-ele.getSize().getWidth();
		
		String date = "20-03-2020";
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-yyyy");
		
		Date d1 = sdf.parse(date);
		
		Date d2 = new Date();
		
		long DayDifferance = TimeUnit.MILLISECONDS.toDays(d2.getTime() - d1.getTime());
		
		
		
		Actions action = new Actions(driver);
		for(int i=0; i<DayDifferance; i++ )
		{
			action.moveToElement(ele, getTopLeftX+i, getTopLeftY).perform();
			System.out.println(i);
			String value = driver.findElement(By.xpath("//table[@class='swWWne']/tbody")).getText();
			System.out.println(value);
			
		}


}
	}