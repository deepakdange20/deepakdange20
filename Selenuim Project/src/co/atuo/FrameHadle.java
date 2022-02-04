package co.atuo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHadle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//driver.findElement(By.xpath("//a[text()='TestNG']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='text' and @id='CVK_E_0']")).sendKeys("I am in Frame");
		

	}

}
