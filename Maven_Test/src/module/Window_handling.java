
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FirstTest.CNN_link;


public class Window_handling extends CNN_link{
	
	public static void openChrome()
	{
		driver=new ChromeDriver();
		maximizeWindow();
		driver.navigate().to("https://www.naukri.com/");
	}

	public static void main(String[] args) {
	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait wit=new WebDriverWait(driver,10);
		wit.until(ExpectedConditions.visibilityOf(null));
		
		setupBinaryFileForChrome();
		openChrome();
	    Set<String> windowHandle=driver.getWindowHandles();
	    System.out.println(windowHandle.size());
	    
	    ArrayList<String> tab=new ArrayList<>(windowHandle);
	    System.out.println(tab.size());
	    
	    if(tab.get(0).equalsIgnoreCase(tab.get(1)))
	    driver.switchTo().window(tab.get(1));
	    driver.close();
	    driver.switchTo().window(tab.get(2));
	    driver.close();
	    driver.switchTo().window(tab.get(3));
	    driver.close();
	    
	    
	    Alert Alt=driver.switchTo().alert();
	    Alt.accept();
	    Alt.getText();
	    
	    driver.switchTo().defaultContent();
	    
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(null));
	}

}
