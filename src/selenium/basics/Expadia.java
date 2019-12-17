package selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expadia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get ("https://www.expedia.com");
		WebElement from = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
		from.clear();
		from.sendKeys("New York");
		
		List <WebElement> airports = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']/div/li"));
		System.out.println(airports.size());
		
		for (WebElement elements : airports) {
			if (elements.getText().contains("JFK")) {
				elements.click();
				break;
			}
		}
		WebElement to = driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
		
		to.clear();
		to.sendKeys("Richmond");
		
		List <WebElement> arrivalAirports = driver.
		
		
		
	}

}
