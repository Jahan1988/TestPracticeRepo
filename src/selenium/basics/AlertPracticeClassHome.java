package selenium.basics;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPracticeClassHome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://mail.rediff.com/cgi-bin/login.cgi\\";
		driver.get(url);
		
		WebElement goButton = driver.findElement(By.xpath("//input[@name='proceed']"));
		goButton.click();
		
		Utility.screenshot(driver, "C:\\Users\\User Win 7\\eclipse-workspace\\SeleniumProject\\Output", "Rediffmail");
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
	
		driver.navigate().to("https://ksrtc.in/oprs-web/");
	
		WebElement operatorFranchisee = driver.findElement(By.xpath("//p[text()='Operator / Franchisee']"));
		operatorFranchisee.click();
	
		Set <String> windowHandle = driver.getWindowHandles();
		
		Iterator <String> it = windowHandle.iterator(); 
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().forward();
		System.out.println(driver.getTitle());
	}

}
