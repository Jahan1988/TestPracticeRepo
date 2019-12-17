package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//0. Set system property for browser
		// syntax = System.setProperty("webdriver.chrome.driver", "path of chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		
		//1. Create object of webDriver
		WebDriver driver = new ChromeDriver ();
		
		// open google.com
		//ur = https://www.google.com/
	//.get() method opens browser
		driver.get("https://www.google.com/");
	
	
	
	
	
	
	}

}
