import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static  WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	        
	        //Setting the webdriver.chrome.driver property to its executable's location
	        System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		
	        //Instantiating driver object
	        driver = new ChromeDriver();
	        driver.get("https://vctcpune.com/selenium/practice.html");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("details-button")).click();
	        driver.findElement(By.id("proceed-link")).click();
//	       String beforexpathcol = "//tbody/tr[";
//	     String xpath= "]/td[";
//	       String afterxpath ="]";
	        findTableText("Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C");
	       
	    	   
	}
	
	 public static void findTableText(String name)
     {
     
     List<WebElement> col =  driver.findElements(By.xpath( "//tbody/tr/th"));	
   int numberofcol = col.size();
    System.out.println(numberofcol);
    List<WebElement> row =  driver.findElements(By.xpath( "//tbody/tr/td[1]"));
    int numberofrow= row.size();
    System.out.println(numberofrow);
   WebElement a = driver.findElement(By.xpath("//tbody/tr[2]/td[2]"));
    System.out.println(a.getText());
    for(int i = 2; i <= numberofrow; i++ )
    {
 	  for(int j = 1; j <= numberofcol; j++ ) {
 	  //WebElement element = driver.findElement(By.xpath(beforexpathcol+i+xpath+j+afterxpath));
 		  WebElement element =  driver.findElement(By.xpath("//tbody/tr[" +i+ "]/td["+j+"]"));
 		  if(element.getText().equals(name))
 		  {
 			  
 			 System.out.println("Element found" + element.getText() + "at row no " +i+" and at col no " + j);
 		  }
 		 
 	   
 	  }
 	   
    }
    }

}
