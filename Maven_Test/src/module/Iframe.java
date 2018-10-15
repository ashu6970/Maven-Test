import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Iframe {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div"))));
		
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id='wallet-container-new qr-bg-white']/qr-code-login/div[2]/div[2]/div[3]/span")).click();
	 
		int total=driver.findElements(By.tagName("iframe")).size();
		
		for(int i=0;i<total;i++)
		{
			driver.switchTo().frame(i);
			int s =driver.findElements(By.xpath("")).size();
			
			if(s==0)
		{  
			driver.switchTo().defaultContent();
		}
						
	}
	}

}
