package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0. set system property for chromedriver
		//1. open chrome browser
		//maximize browser
		//set page load 10 sec
		//set implicit wait 30 sec
		//go to canvas page url: https://canvas.instructure.com/login/canvas
		//get title of canvas page \ store in a String and print it 
		// find email element by id enter your email/
		//find pass element by id enter your pass
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://canvas.instructure.com/login/canvas");
		String actualTitle = driver.getTitle();
		driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys("oguljahanrejepova@gmail.com");
		driver.findElement(By.id("pseudonym_session_password")).sendKeys("R19121988Jtm");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button")).click();
		
	
		//driver.findElement(By.className())

	//driver.findElement(By.xpath("//input[@name='/pseudonym_session[unique_id]']));
	//driver.findElement(By.xpath(//input[@name='pseudonym_session[unique_id]']))	
	
	//driver.findElement(By.xpath(//img[@alt='Free For Teacher']))
	//driver.findElement(By.xpath(//div[@class='ic-Login__banner-title']))
	//driver.findElement(By.xpath(//div[@class='ic-Login__banner-subtitle']))
	///driver.findElement(By.xpath(//a[@class='ic-Login__link']))
	//driver.findElement(By.xpath(//label[@for='pseudonym_session_remember_me']))
	//driver.findElement(By.xpath(//a[@class='ic-Login__link forgot_password_link']))
	//driver.findElement(By.xpath(//span[@role='presentation']))
	//driver.findElement(By.xpath());
			
			
	}

}
