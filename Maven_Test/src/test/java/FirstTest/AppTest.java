package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class AppTest 
{
	 @Test
	    public void setup()
	    {
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("https://www.healthie.in");
	    }
    
}
