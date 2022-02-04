package co.atuo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//td[text()='Cameras']//preceding-sibling::td//input[@type="checkbox"]package co.atuo;

public class Dyanamicxapth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.get("https://demo.opencart.com/admin/index.php?route=catalog/category&user_token=7YltboUwZIH0cRAbRGmYUbVbw9aZS3M8");
	//	driver.manage().timeouts().
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Catalog")).click();
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.xpath("//td[text()='Cameras']//preceding-sibling::td//input[@type='checkbox']")).click();

	}

}
