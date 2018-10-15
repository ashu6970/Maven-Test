import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cookies {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.healthie.in/home'");
		
		// It returns the page is loading complete or not.
		String state=(String)js.executeScript("return document.readyState");
		System.out.println(state);
		
		// same as find the xpath and entered the value using javascript.
		js.executeScript("document.getElementById('').value='jdfl';");
		
	  Thread.sleep(5000);
	  
	  // used for window handling in the browser
	  Set<String> windowHandle=driver.getWindowHandles();
	    System.out.println(windowHandle.size());
		 Thread.sleep(3000);
	  int x=	driver.findElement(By.xpath("//*[@id='h-city']")).getLocation().x;
	  int y=	driver.findElement(By.xpath("//*[@id='h-city']")).getLocation().y;
		
	  System.out.println(x+"---"  +y);
	//	Cookie c1=new Cookie("","");
		
	//	driver.manage().deleteCookie(c1);
		
	//	driver.manage().addCookie(c1);
		
	  // To set the cookie for the browser
		Set<Cookie> cook=driver.manage().getCookies();
		
		Iterator<Cookie> itr= cook.iterator() ;
		
		while(itr.hasNext())
		{
			Cookie c=itr.next();
			
			System.out.println(c.getName()+"---------"+c.getValue());
		}
		
		Thread.sleep(5000);
		driver.quit();	
	
		
		File u=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(u, new File(""));
		

	}

}
