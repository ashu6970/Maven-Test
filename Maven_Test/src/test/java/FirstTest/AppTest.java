package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AppTest 
{
	public static void main(String[] args)
	{
	//WebDriverManager.chromedriver().setup();
	
	WebDriverManager.firefoxdriver().setup();

	//WebDriver driver= new ChromeDriver();
	WebDriver driver1= new FirefoxDriver();
	System.out.println("Hello Maven World");
	}
    
}
