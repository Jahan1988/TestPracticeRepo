package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	String userName = "admin";
	String password = "admin";
	//http://the-internet.herokuapp.com/basic_auth
	//syntax for bypassing athoPopus
	//http://userName:password@the-internet.herokuapp.com/basic_auth
	String url = "http://" + userName+ ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
	
	driver.get(url);
	System.out.println(driver.getTitle());
	
	
	}

}
