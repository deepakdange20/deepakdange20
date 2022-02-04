package co.atuo;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//implicitlyWait
		//apllied for whole page
		//if element not found wait for 10 sec again check 
		long beforeTime =System.currentTimeMillis();
	//	WebElement bestSellers =driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		//WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		long afterTime =System.currentTimeMillis();
		System.out.println(afterTime-beforeTime);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement wallet	=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'NAPA HIDE Black Leather Wallet for Men')]")));
		wallet.click();
		
		WebElement bestSellers =driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
		Wait<WebDriver> fluetWait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))//waitig time
									.pollingEvery(Duration.ofSeconds(2))//
									.ignoring(NoSuchElementException.class);
		
		getElemet(driver, By.xpath("//input[@id='twotabsearchtextbox']"));
		sendKeys(driver, 10, searchBox, "mobile");
		click(driver, 10, bestSellers);

		
	}

	
	public static void sendKeys(WebDriver driver , int timeout, WebElement ele , String text)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element= wait.until(ExpectedConditions.visibilityOf(ele));
		element.sendKeys(text);
	}
	
	public static void click(WebDriver driver , int timeout, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();
	}
	
	public static WebElement getElemet(WebDriver driver, By ele) 
	{
		return driver.findElement(ele);
	}
	
}
