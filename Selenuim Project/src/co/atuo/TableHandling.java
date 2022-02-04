package co.atuo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Smart\\Desktop\\A\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	
		List<WebElement> list1=driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));
		int row=list1.size();
		List<WebElement> list2=driver.findElements(By.xpath("//table[@id='countries']//tbody//tr[1]/td"));
		int col = list2.size();
		int c=0;
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++) 
			{
				
				String value = driver.findElement(By.xpath("//table[@id='countries']//tbody//tr["+i+"]"
						+ "//td["+j+"]")).getText();
				System.out.print(value+" | ");
				if(value.contains("French"))
				{
					//System.out.println(i+" : "+j);
					c++;
				}
			}
			System.out.println();	
		}
		System.out.println(c);

		
	}

}
