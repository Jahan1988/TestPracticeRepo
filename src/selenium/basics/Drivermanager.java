package selenium.basics;

import java.sql.Connection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0. set system property for chrome browser
		//1.initialize chrome driver
		//2.get to facebook page
		//3.get facebook title
		//4. store title in string name 
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//.browser manage comands:
		driver.manage().window().maximize();//maximize the window
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https:\\facebook.com");
		
		String actualtitle = driver.getTitle();
		String expectedTitle = "Facebook - log In or Sign up";
		
		if (actualtitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		}else 
			System.out.println("wrong title");
		
		//find email or phone elements
		driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("test@test.com");
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).clear();
	
	//clearing password field
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("pass")).sendKeys("123");
	driver.findElement(By.id("email")).clear();
	
	driver.findElement(By.id("u_0_2")).click();
	
	
	
	
	}

	

	
	

}
