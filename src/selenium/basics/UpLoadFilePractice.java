package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoadFilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
		WebElement uploadFile = driver.findElement(By.xpath("//input[@value='Press']"));
		uploadFileMethod(uploadFile, "C:\\Users\\Public\\Pictures\\Sample Pictures\\New Text Document.txt");
	}

	public static void uploadFileMethod (WebElement element, String path) {
		element.sendKeys(path);
	}
}
