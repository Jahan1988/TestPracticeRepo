package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkedIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set up driver
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		//create object of driver
		WebDriver driver = new FirefoxDriver ();
	
		driver.get("https:\\linkedin.com");
	
		String title = driver.getTitle();
	//write a code that print "This is google website title" If title is Google
		// other wise it prints "wrong title"
	String expectedTitle= "Google";
		if (title.contentEquals(expectedTitle)) {
			System.out.println("This is google website title"+title);
		}else {
			System.out.println("Wrong title");
		}
	System.out.println(title);
	
	
	
	
	}

}
