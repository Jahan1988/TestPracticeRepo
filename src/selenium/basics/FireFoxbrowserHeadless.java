package selenium.basics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxbrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//create an object of firefox options
		FirefoxOptions firefoxOptions = new FirefoxOptions(); 
		//add headless arguments to firefox options
		firefoxOptions.addArguments("--headless");
		//instantiate firefox browser
		WebDriver driver = new FirefoxDriver (firefoxOptions);
	
		//open tek school page and print title
		driver.get("https://www.tekschoolofamerica.com");
		System.out.println(driver.getTitle());
		//take screenshot
		try {
			Utility.screenshot(driver, "C:\\Users\\User Win 7\\eclipse-workspace\\SeleniumProject\\Output", "FireFoxHeadlesspic");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
