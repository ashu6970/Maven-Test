package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCI {

	public static void main(String[] args) throws ParseException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://loan.icicibank.com/asset-portal/auto-loan/check-eligibility?WT.mc_id=NLI_Apply_Online_page");
		String date= "2/12/1991";
		
		SimpleDateFormat Date1=new SimpleDateFormat("dd/MM/yyyy");
		Date formated=Date1.parse(date);
		
		String month=new SimpleDateFormat("MMM").format(formated);
		System.out.println(month);
		int day=Integer.parseInt(new SimpleDateFormat("dd").format(formated));
		System.out.println(day);
		
		int year=Integer.parseInt(new SimpleDateFormat("yyyy").format(formated));
		System.out.println(year);
		
		while(true)
		{
			driver.findElement(By.xpath("//div[@class='custom-date-holder']/span/span/img")).click();
			String text=driver.findElement(By.xpath("//*[starts-with(@id,'datepicker-')]/strong)")).getText();
			int lowercase=Integer.parseInt(text.split("-")[0]);
			int uppercase=Integer.parseInt(text.split("-")[1]);
			System.out.println(lowercase  +  uppercase);
			
			if(lowercase <= year &&  year<=uppercase)
			{
				
			}
			else if(year <lowercase)
			{
				
			}
			else if(uppercase<year)
			{
				 
			}
		}

	}

}
