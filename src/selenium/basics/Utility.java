package selenium.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {



	public static void screenshot(WebDriver driver,String locationofFile, String fileName) throws IOException {
		//take screenshot using TakeScreenShot method of Selenium and store as file
		//give location path, file name, file type".png"
		
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(locationofFile+fileName+".png"));
			}
/*
 * This method captures date from calendar using JSExecuter 
 */
	public static void selectDateByJS(WebDriver driver, WebElement element, String date) {

	// create object of JavaScriptExecutor class 
			JavascriptExecutor js= ((JavascriptExecutor) driver);
			
			// we use executeSript method to capture date. 
			js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}	
}
