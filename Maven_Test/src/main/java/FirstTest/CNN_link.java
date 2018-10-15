package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN_link extends CNN{
	
	public static WebDriver driver;

	public static void main(String[] args) {
		int i=1;

		setupBinaryFileForChrome();
		openChrome();
		maximizeWindow();
		String a="//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String b="]";
		
		while(isElementPresent("a+i+b", "xpath"))
     	{
			
			String text=driver.findElement(By.xpath("a+i+b")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("a+i+b")).click();
			getResponseCode("https://edition.cnn.com/");
			System.out.println(driver.getTitle());
			driver.navigate().back();
			i++;
			
     	}	
		
		
	}
	
	public static  void setupBinaryFileForChrome()
	{
		WebDriverManager.chromedriver().setup();
	}
	
	public static void openChrome()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://edition.cnn.com/");
	}
	
	public static void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	public static boolean  isElementPresent(String locator,String locatortype)
	{
		List<WebElement> allElements=null;
		if(locatortype.equals("xpath"))
			allElements=driver.findElements(By.xpath(locator));
		
		if (allElements.size()==0)
		return false;
		else 
			
			return true;
	}
	

}
