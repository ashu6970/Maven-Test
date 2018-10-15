import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import FirstTest.CNN_link;


public class Module_16 extends CNN_link {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.google.co.in/'");
		
		driver.findElement(By.name("q")).sendKeys("hello");
		
		List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(opt.size());

	}

}
