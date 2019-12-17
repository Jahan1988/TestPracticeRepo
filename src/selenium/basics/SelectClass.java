package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://tekschoolofamerica.com");
		driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Phone & PDAs']")).sendKeys(Keys.ENTER);
		
		WebElement phone_PDAs = driver.findElement(By.xpath("//a[text()='Phone & PDAs']"));
		phone_PDAs.click();
		//wait some seconds thread -exceptions handeling
		try {
		Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//to handle static dropdown we use select class
		
		WebElement sortByElement = driver.findElement(By.xpath("//select[@id='input-sort']"));
		
		Select select = new Select (sortByElement);
		select.selectByVisibleText("Name(Z - A)");
		Thread.sleep(5000);
		select.selectByVisibleText("Price (High > Low)");
	
		Thread.sleep(5000);
		//1.select by value
		//select.selectByValue("");
		//2.select by index
		select.selectByIndex(4);
	
		
		
		driver.close();
	
	}

}
