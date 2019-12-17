package selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//this method all cookies will delete cookies or  
		driver.manage().deleteAllCookies();
		String url = "https://tekschoolofamerica.com";
				driver.get(url);
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "TEK SCHOOL";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle);
		}else {
			System.out.println("Wrong title");
		}
		//driver.findElement(By.xpath("Phones & PDAs")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
		//how can I store this above element in webElement, 
		//sellenium is provides this element what we can store in object of webelement
		WebElement logo =  driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
		//if I wonna access in this Webelement, I don't need store above element again and again
		//just logo.method what you want
		//it will reduce the code redundancy
		System.out.println(logo.getText());//it's gonna print the text of element (extract the text)
		System.out.println(logo.isDisplayed());//it's boolean, return type of element, 
		//it means: if the element displayed = true, doesn't display=false
		
		
		//findelements - will find all the elements on the web page, which has the same tag
		driver.findElements(By.tagName("a"));//we gonna store this element in the list, 
		//then we can travel in a list, and looking for, which element do we want 
	//create a list links//return type of driver.tagname is List
		List <WebElement> links = driver.findElements(By.tagName("a"));
	//size of list
		System.out.println(links.size());
		//type of this list is WebElement, links=travel in this list
		//print all of the elements which is tag="a"
		for (WebElement webLinks : links) {
			String elementText = webLinks.getText();{
				System.out.println(elementText);
				//if elementText equals to Phone and PDAs then click
				if (elementText.equals("Phones & PDAs")) {
					webLinks.click();
					break;
				}
				//we have rest of elements, which has Tag = "a"
				//when we create links.size it's giving size of elements in this list
				
			}
			
			driver.findElements(By.tagName("div"));
			List <WebElement> link = driver.findElements(By.tagName("div"));
			System.out.println(link.size());
			
			for (WebElement webLink : link) {
				String elementTexts = webLink.getText();{
					System.out.println(elementTexts);
					
					
					if (elementTexts.equals("Phones and PDAs")) {
						webLink.click();
						break;
					}
						
				}
			}
		}
	
	}
}
