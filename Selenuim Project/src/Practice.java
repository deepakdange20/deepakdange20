import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        driver.manage().window().maximize();
        
        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(By.linkText("Sign in"))).perform();
        
      
	}

}
