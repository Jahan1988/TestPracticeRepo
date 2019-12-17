package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClassHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//this method all cookies will delete cookies or  
		driver.manage().deleteAllCookies();
		String url = "https://tekschoolofamerica.com/test-environment/";
				driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Phones & PDAs']"));
		WebElement phones_PDAs = driver.findElement(By.xpath("//a[text()='Phones & PDAs']"));
			phones_PDAs.click();	
	
			
			//to handle static dropdowns we use select class
	        //before using the select class we need to find the element of dropdown

		WebElement sortByElement =driver.findElement(By.xpath("//select[@id='input-sort']"));

		//we should create select class to select some value from it
		Select select = new Select(sortByElement);
		//select.selectByVisibleText("Price (Low > High)");
		//select.selectByIndex(4);
		select.selectByValue("https://tekschoolofamerica.com/test-environment/index.php?route=product/category&path=24&sort=p.price&order=DESC&limit=100");

		WebElement showElement = driver.findElement(By.xpath("//select[@id='input-limit']"));
		
		Select select1 =new Select(showElement);
		//select1.selectByVisibleText("75");
		//select1.selectByIndex(4);
		select1.selectByValue("https://tekschoolofamerica.com/test-environment/index.php?route=product/category&path=24&sort=pd.name&order=ASC&limit=25");
	
		
		//wait 5 or 10 seconds
		
		//wait few seconds before select next action
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.close();//close only current window 
	//driver.quit();//close all opened windows which are open by webDriver
	
	
	}
}
