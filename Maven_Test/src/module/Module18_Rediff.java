import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Module18_Rediff {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.rediff.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();;
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("ashuim");
		driver.findElement(By.id("password")).sendKeys("pass@1234");
		driver.findElement(By.name("proceed")).sendKeys(Keys.ENTER);
		
		boolean check= isElementPresent("//cite[@class='rd_logo']/a");
		Assert.assertTrue(check, "Test case are not passed");
		
	//	WebDriverWait wait= new WebDriverWait(driver, 5);
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//cite[@class='rd_logo']/a"))));
		
	//	driver.findElement(By.xpath("//cite[@class='rd_logo']/a")).click();

	}
	
	public static boolean isElementPresent(String xpath)
	{
		int e= driver.findElements(By.xpath(xpath)).size();
		
		if (e==0)
		
		return false;
			
		else 
				
		return true;
		
	}

}
