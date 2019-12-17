package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.aa.com/homePage.do");
		
		driver.findElement(By.id("loginForm.loginId"));
		driver.findElement(By.id("loginForm.lastName"));
		driver.findElement(By.id("loginForm.password"));
		driver.findElement(By.id("jq-findFlights"));
		driver.findElement(By.id("jq-myTripsCheckIn"));
		driver.findElement(By.id("jq-flightStatus"));
		driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		driver.findElement(By.id("aa-leavingOn"));
		driver.findElement(By.id("aa-returningFrom"));
		driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
		
		driver.findElement(By.name("adultOrSeniorPassengerCount"));
		driver.findElement(By.name("originAirport"));
		driver.findElement(By.name("destinationAirport"));
		driver.findElement(By.name("departDate"));
		driver.findElement(By.name("returnDate"));
		driver.findElement(By.name("lastName"));
		driver.findElement(By.name("loginId"));
		driver.findElement(By.name("password"));
		driver.findElement(By.name("q"));
		
		
		WebElement airports = driver.findElement(By.xpath("//input[@type='hidden']"));
		WebElement airposrt = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		WebElement depart = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
		WebElement returnDate = driver.findElement(By.xpath("aa-returningFrom"));
		WebElement numberOfPassengers = driver.findElement(By.xpath("flightSearchForm.adultOrSeniorPassengerCount"));
		
		
		WebElement departure = driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
		WebElement airport = driver.findElement(By.cssSelector("input[id='reservationFlightSearchForm.destinationAirport']"));
		WebElement numbersPassengers= driver.findElement(By.cssSelector("select[name='adultOrSeniorPassengerCount']"));
		WebElement departs = driver.findElement(By.cssSelector("input[id='aa-leavingOn']"));
		WebElement returnDates = driver.findElement(By.cssSelector("input[name='returnDate'']"));
		WebElement username = driver.findElement(By.cssSelector("input[name='loginId']"));
		
		
	}

}
