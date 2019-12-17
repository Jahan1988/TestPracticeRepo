package selenium.basics;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDowns {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		//create chromOptions class to cover HeadLess browser
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		
		driver.get("https://www.aa.com/homePage.do");
		
		//1. grab the departure box xpath
		//2.Store in a webelement object
		//3.clear the box
		//4. send (Wash) value
		//5. create a list for storing webelement of dropdowns
		//6.Create for each loop to travel list indexes
		//7.write an if condition to click or select value we want
		//8.break from the loop
		
		//1.//input[@id='reservationFlightSearchForm.originAirport']
		//2.
		Actions actions = new Actions (driver);
		WebElement requirements = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[5]/div[1]/div/p[3]/a"));
		
		actions.moveToElement(requirements).build().perform();
		Thread.sleep(5000);
		WebElement departure = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
	    //3.
		departure.clear();
		//4.
		departure.sendKeys("Wash");
		Thread.sleep(5000);
		
		//5.
		List <WebElement> airports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));//traveling from parent to child
	    System.out.println(airports.size());
	
	    //create for each loop
	    
	    for (WebElement element : airports) {
	    	try {
	    	if (element.getText().contains("BWI"))
	    		element.click();
	    	break;
	    	}catch(StaleElementReferenceException e) {
	    		System.out.println("Element is no longer attached to dom");
	    	}
	    }
	
	
	    Utility.screenshot(driver, "C:\\Users\\User Win 7\\eclipse-workspace\\SeleniumProject\\OutputSDET001.png", "AA");
	
	WebElement cities = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
	cities.clear();
	cities.sendKeys("New");
	List <WebElement> city = driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
	System.out.println(city.size());
	for (WebElement elements : city) {
		try {
		if (elements.getText().contains("PHF"))
			elements.click();
		break;
		}catch(StaleElementReferenceException e) {
		System.out.println("Element is no longer attached to dom");
	}
	
	}
	
	Utility.screenshot(driver, "C:\\\\Users\\\\User Win 7\\\\eclipse-workspace\\\\SeleniumProject\\\\OutputSDET001.png", "BB");
	////////////////////////////////////////////////////////////
	WebElement numberOfPassengers = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
	
	Select select = new Select(numberOfPassengers);
	select.selectByValue("4");
	//select.selectByIndex(4);
	//select.selectByVisibleText("5");
	Utility.screenshot(driver, "C:\\Users\\User Win 7\\eclipse-workspace\\SeleniumProject\\OutputSDET001.png", "CC");
	
	
	WebElement cities1 = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
	cities1.clear();
	cities1.sendKeys("LAS");
	
	List <WebElement> city1 = driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
	System.out.println(city1.size());
	
	for (WebElement elements: city1) {
		try {
		if (elements.getTagName().contains("LAS")) {
			elements.click();
			break;
		}
		}catch(StaleElementReferenceException e){
			System.out.println("Element is no longer attached to dom");
		}
	}
	Utility.screenshot(driver, "C:\\Users\\User Win 7\\eclipse-workspace\\SeleniumProject\\Output", "LV");
	///////////////////////////////////////////////////
	WebElement numbers = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
	
	Select select1 = new Select (numbers);
	select1.selectByIndex(4);
	

	//Storing departure date in a webElement obj
	WebElement departureCalendar = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
	//selecting desire date using JSExecutor class
	Utility.selectDateByJS(driver, departureCalendar, "11/21/2019");
	
	WebElement returnCalendar = driver.findElement(By.xpath("//input[@id='aa-returningFrom']"));
	Utility.selectDateByJS(driver, returnCalendar, "11/30/2019");
	
	Utility.screenshot(driver, "C:\\Users\\User Win 7\\eclipse-workspace\\SeleniumProject\\Output", "ReservationHeadless");
	
	
	
	
	}
}

