package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;



import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://edition.cnn.com/");
		
		getResponseCode("https://edition.cnn.com/");
		String a="//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String b="]";
		
		//isElementPresent("","")	;	
		
		for(int i=1; i<=10;i++)
		//int i=1;
		//while(isElementPresent("a+i+b","xpath"))
		{
			String text= driver.findElement(By.xpath(a+i+b)).getText();
			System.out.println(text);
		}
	}
	
	
	// It will give you the object reference for all the object.
		
		/*public static boolean isElementPresent(String locator, String locatorType)
		{
				
			List<WebElement> allElements=null;
			
			if(locatorType.equals("xpath"))
				allElements=driver.findElements(By.xpath(locator));
			
			if(allElements.size()==0)
				return false;
			else
				return true;
			
		}
		*/
	public static boolean getResponseCode(String url){
		int resp_code=0;
		try {
			resp_code = Request.Get(url).execute().returnResponse().getStatusLine()
			        .getStatusCode();
	        System.out.println("Respose code for URL "+ url +" is -> "+ resp_code);
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if(resp_code==200)
        	return true;
        else 
        	return false;
	}
		

	}


