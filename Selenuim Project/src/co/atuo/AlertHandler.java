package co.atuo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-success navbar-toggle']")).click();
		Alert alt =driver.switchTo().alert();
		alt.accept();
		System.out.println(alt.getText());
		alt.dismiss();
	//	alt.sendKeys("Deepak");
	
		//alt.accept();
		
	
	}
}
