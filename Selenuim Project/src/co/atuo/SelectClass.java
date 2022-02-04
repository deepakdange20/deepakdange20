package co.atuo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement months =driver.findElement(By.xpath("//select[@id='month']"));
		
		Select select = new Select(months);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("Jul");
		Thread.sleep(2000);
		select.selectByValue("12");
		List<WebElement> list=select.getOptions();
		
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).getText());
			
		}
		//select.deselectByValue("12");//use fro multiple options selection all deselect method
		System.out.println(select.getFirstSelectedOption().getText());
		
	}

}
