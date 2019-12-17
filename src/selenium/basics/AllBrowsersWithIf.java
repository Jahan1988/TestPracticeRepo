package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsersWithIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver = null;
		
		
		String browsers = "";
			
	
	if (browsers.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver = new ChromeDriver();}
	
	else if (browsers.equals("FireFox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	driver = new FirefoxDriver();}
	
	else if (browsers.equals("IE")){
		System.setProperty("webdriver.ie.driver", "C:\\IEDriver.exe");
		driver = new InternetExplorerDriver();
	}
	
		else {System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();}
	
	driver.get("https\\www.google.com");
	}
	
	}
	
	


