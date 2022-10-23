package automationthird;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Bestbuy {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bestbuy.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
 String ActualCurrentUrl = "https://www.bestbuy.com";
 String ExpectedCurrentUrl = (driver.getCurrentUrl());
 String ActualTitle ="Best Buy | Official Online Store | Shop Now & Save";
 String ExpectedTitle = (driver.getTitle());
 
 if(ActualCurrentUrl.equals(ExpectedCurrentUrl) && ActualTitle.equals(ExpectedTitle)) {
	 System.out.println("my url is correct");
 }else {
	 System.out.println("my url is incorrect");
 }
	}

}
