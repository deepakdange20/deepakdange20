

	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	
	
	public class FileUpload {
	    public static void main(String[] args) {
	    	
	    	System.setProperty("webdriver.chrome.driver","D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	        String baseUrl = "http://demo.guru99.com/test/upload/";
	        WebDriver driver = new ChromeDriver();

	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\SelenuimProject\\src\\box.png");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	        }
	}

