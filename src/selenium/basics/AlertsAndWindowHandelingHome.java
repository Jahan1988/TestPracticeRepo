package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndWindowHandelingHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchButton.click();
		//to handle popups we should use switch method
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	    System.out.println(driver.getTitle());
	
	    WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
	    crm.click();
	
	    //in order to switch from parent window to child window we should do below actions:
	    //1.
	
	
	
	}

}
