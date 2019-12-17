package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Declare a string and assign an empty value; 
		//name of String should be browser
		
		
		WebDriver driver = null;
		String browser = "";
		//write a switch case to switch for three browsers. If it opens 
		//IE browser if case it open FF
	//If case is chrome it open chrome and default should open chrome
		
		switch (browser){
		case "IE" :
		
		System.setProperty("webdriver.ie.driver", "C:\\ieDriverServer.exe");
		driver = new InternetExplorerDriver();
		break;
		
		case "FF":
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver ();
		
		break;
		
		case "Chrome":
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		break ;
		default :
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		
		}
	
	
	}

}
