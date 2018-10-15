package FirstTest;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Selenium Learning");
	 String text=	driver.findElement(By.xpath("//input[@id='login1']")).getAttribute("value");
     System.out.println(text);
     driver.findElement(By.xpath("//input[@id='remember']")).click();
     text=driver.findElement(By.xpath("//input[@id='remember']")).getAttribute("checked");
     System.out.println(text);
     
		driver.quit();
		
	}
   
}
