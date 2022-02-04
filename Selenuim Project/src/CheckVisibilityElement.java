import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityElement {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.classiccrm.com/register/"); // enter URL
		
		//isDiplayed() Method:
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1); //true
		
		//before selecting checkbox --I agree
		//isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); //false
		
		//lets make submit button enabled:
		driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox
		
		//after selecting checkbox --I agree
		//isEnabled() method:
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3); //true
		
		
		//isSelected() method: only applicable for checkbox, dropdown, radiobutton
		boolean flag1 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag1); //true
				
		//de-select the checkbox-- I Agree
		driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox

		boolean flag2 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag2); //false
		
		
		
		
	}

}
