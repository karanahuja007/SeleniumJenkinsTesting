package htmlUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AcitonDriver 
{

    static WebDriver driver;
	public static void main(String[] s)
	{
		
		java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
	    java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
	    
		//driver = new HtmlUnitDriver(true);
		
		
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Karan");
		System.out.println("Find name as Karan");
		driver.findElement(By.name("btnG")).click();
		System.out.println("Clicked on find button");
		
		
		driverclose();
		
	}

	private static void driverclose() 
	{
		driver.close();
		driver.quit();
		System.out.println("Driverclose");
		
	}

}
