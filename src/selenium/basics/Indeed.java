package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Indeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setup Driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//create object of driver
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\indeed.com");
	}

}
