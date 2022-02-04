package co.atuo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-grid-tutorial");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='About Us']")));
		js.executeScript("window.scrollBy(0,-6000);");
	}

}
