package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Chrome_Options {

	public static void main(String[] args) {
		// Pre requisites - 1 or 2 Version  , turn off update version
		//Page load strategy
				FirefoxOptions opt= new FirefoxOptions();
				opt.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//Logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"File location where you want to store");
		
		//Binary - No Need 
		//Profiling
		ProfilesIni pro=new ProfilesIni();
		FirefoxProfile p=pro.getProfile("learning");
		opt.setProfile(p);
		
		//Notification
		p.setPreference("dom.webnotifications.enabled", true);
		//Certification
		p.setAcceptUntrustedCertificates(true);
		p.setAssumeUntrustedCertificateIssuer(false);
		//Proxy server setting
		p.setPreference("network.proxy.type", 1);
		
		opt.setProfile(p);
        ChromeDriver c=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver(opt);
		driver.get("https://qahlt31.healthie.in");
		driver.quit();
	}

}
