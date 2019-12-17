package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://xndev.com/display-image/");
		
		//Store choose file element in a weblement object
		
		WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		                    //path of file//filename.ext
		//uploadFile.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");
	uploadFileMethod(uploadFile, "C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");
	
	}


//create a method to perform uploading a file
//this method has to arguments (webElement and String path)

public static void uploadFileMethod (WebElement element, String path) {
	element.sendKeys(path);
}
}






