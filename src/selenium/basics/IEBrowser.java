package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0. set system property
		
		System.setProperty("webdriver.ie.driver", "C:\\ieDriverServer.exe");
	
	//create object
		WebDriver driver = new InternetExplorerDriver();
	
		driver.get("https://www.google.com/");
	}

}
