import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDatePicker {
	  
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
		selectCalenderData("1", "June", "2024");
       
	}
	
	public static void selectCalenderData(String xday, String xmonth, String xyear) {

		if (xmonth.equals("February") && (Integer.parseInt(xday) > 29) && (Integer.parseInt(xyear) % 4) == 0)
		{
			System.out.println("Wrong Date Enter:" + xday + "-" + xmonth + "-" + xyear);
			return;
		}

		else if (xmonth.equals("February") && (Integer.parseInt(xday) > 28)) 
		{
			System.out.println("Wrong Date Enter1:" + xday + "-" + xmonth + "-" + xyear);
			return;
		} 
		else if (xmonth.equals("January") || xmonth.equals("March") || xmonth.equals("May") || xmonth.equals("July")
				|| xmonth.equals("August") || xmonth.equals("October")
				|| xmonth.equals("December") && Integer.parseInt(xday) > 31)
		{
			System.out.println("Wrong Date Entered 2:" + xday + "-" + xmonth + "-" + xyear);
			return;
		}

		else if (Integer.parseInt(xday) > 30) {
			System.out.println("Wrong Date Entered 3:" + xday + "-" + xmonth + "-" + xyear);
			return;
		}

		driver.findElement(By.id("datepicker")).click();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
				.visibilityOfAllElements(driver.findElements(By.className("ui-datepicker-calendar"))));

		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearval);
		String month = monthyearval.split(" ")[0].trim();
		String year = monthyearval.split(" ")[1].trim();
		System.out.println(month);
		System.out.println(year);
		while (!(xmonth.equals(month) && xyear.equals(year))) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearval);
			month = monthyearval.split(" ")[0].trim();
			year = monthyearval.split(" ")[1].trim();
			// System.out.println(month);
			// System.out.println(year);
		}
		driver.findElement(By.xpath("//a[text() ='" + xday + "']")).click();

	}

}
