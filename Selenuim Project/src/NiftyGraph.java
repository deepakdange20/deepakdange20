import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NiftyGraph {

	public static void main(String[] args) throws ParseException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=nifty&oq=nifty&aqs=chrome.0.69i59j0i271l2j69i60l3.9215j0j7&sourceid=chrome&ie=UTF-8");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class= 'qUjgX IbhwJb']/div[@aria-label='1 year']")).click();
		WebElement ele =driver.findElement(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])"));
		
//		  int getTopLeftY = 0;//ele.getSize().getHeight();
//		  int getTopLeftX = 0; //ele.getSize().getWidth();
//		  System.out.println(getTopLeftX); System.out.println(getTopLeftY);
		 
		  int getTopLeftY=ele.getRect().height/-2;//top
		  int getTopLeftX=ele.getRect().width/-2;//left
		String date = "01-10-2020";
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-yyyy");
		
		Date d1 = sdf.parse(date);
		
		Date d2 = new Date();
		
		long DayDifferance = TimeUnit.MILLISECONDS.toDays(d2.getTime() - d1.getTime());
		
		
		 
		System.out.println(DayDifferance);
		
		Actions action = new Actions(driver);
		for(int i=0; i<DayDifferance; i++ )
		{
			
			action.moveToElement(ele, getTopLeftX+i, getTopLeftY).perform();
		System.out.println(i);
		
			//String nifty= driver.findElement(By.xpath("//div[@class='knowledge-finance-wholepage-chart__hover-card-range IsqQVc fw-price-nc']")).getText();
		//	String value = driver.findElement(By.xpath("//span[contains(text(),'14:05')]")).getText();
		//	System.out.println(nifty);
		//	System.out.println(value);
			
		}
	


	}

}
