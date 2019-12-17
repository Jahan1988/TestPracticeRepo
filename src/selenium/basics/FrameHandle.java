package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//switch to frame
		driver.switchTo().frame("bot");
		////h2[contains(text(),'Footer ')]
	
		WebElement footer = driver.findElement(By.xpath("//h2[contains(text(),'Footer ')]"));
	
		System.out.println(footer.getText());
	
	   //switching to default page
	   driver.switchTo().defaultContent();

	
	
	
	
	}

}
