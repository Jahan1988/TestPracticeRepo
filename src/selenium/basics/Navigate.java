package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//opening like .get. difference it's gonna open and wait till page load 
		driver.get("https://tekschoolofamerica.com");
		Thread.sleep(5000);
		driver.navigate().to("https://tekschoolofamerica.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		driver.navigate().refresh();
	
	
	
	
	}

}
