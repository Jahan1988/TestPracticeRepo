package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClassHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//this method all cookies will delete cookies or  
		driver.manage().deleteAllCookies();

		driver.get("https://tekschoolofamerica.com/test-environment/");
		Thread.sleep(5000);

		driver.navigate().to("https://tekschoolofamerica.com");
		//it.does same job like driver.get, 
		//but driver.get-open the browser and wait page to load
		//navigate-open page, but if we have some problem with opening
		//it's gonna show us exception
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
