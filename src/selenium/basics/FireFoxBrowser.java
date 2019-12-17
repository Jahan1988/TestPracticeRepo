package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0.system property setup
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		//1. create object of webdriver to run FireFox driver
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		//write a code that print "This is google website title" 
		//If title is Google other wise it prints wrong title"
		String expectedTitle = "Google";
		if (title.contentEquals(expectedTitle)) {
			System.out.println("This is google website title" + title);
		}else 
				System.out.println("Wrong title");
		
		
		System.out.println(title);
		
		//write a code that print "This is google website title" If title is Google other wise it prints wrong title"
		
		//close browser
		//close ()
		driver.close();
		
		
	}

}
