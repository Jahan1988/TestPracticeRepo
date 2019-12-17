package selenium.basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndWindowHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	String url = "https://ksrtc.in/oprs-web/";
	driver.get(url);
	
	//navigate to website
	WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
	
	searchButton.click();//we have popus
	//to handle window popus we will use switch method
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	//get title of the page
	System.out.println(driver.getTitle());
	
	WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
	crm.click();


	//in order to switch from parent window to child window we need to do below action
	//1.get all window Handlers and store in a SET doesn't stored in order, set doesn't take dublicate value
	Set <String> WindowHandels = driver.getWindowHandles();
	//2.use Iterator to iterate in window Handlers list
	Iterator <String> it=WindowHandels.iterator();
	//3.store parent window handler in a string
	String parentWindow = it.next();
	//4.store Child window handler in a string
	String childWindow = it.next();
	//5.use SwitchTo.window method of switching from parent to child
	driver.switchTo().window(childWindow);
	System.out.println(driver.getTitle());
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
	
	
	}

}
