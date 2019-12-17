package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLogPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://canvas.instructure.com/login/canvas");
		String actualTitle = driver.getTitle();
		
		driver.findElement(By.xpath("//input[@name='pseudonym_session[unique_id] and'@type='text' and @id='pseudonym_session_unique_id']"));
	
		driver.findElement(By.xpath("//input[@type='password' or '@type='text'"));
	//contains

	
	}

}
