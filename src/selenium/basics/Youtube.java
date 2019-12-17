package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set up deriver
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	
		//create object of webDriver
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https:\\www.youtube.com");
	
	
	}

}
