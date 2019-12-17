package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserHeadLess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		//create object of chrome options 
		ChromeOptions chromeOptions = new ChromeOptions();
		//add headless argument to chromeOptions object
		chromeOptions.addArguments("--headless");
		//instantiate chromBrowser //chromeBowser headless
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//go to tekSchool page and print out title
		driver.get("https://www.tekschoolofamerica.com");
		//System.out.println(driver.getTitle());
	
	
	}

}
