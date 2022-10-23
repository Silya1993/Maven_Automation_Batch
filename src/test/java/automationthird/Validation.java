package automationthird;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.walmart.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		String ActualCurrentUrl = "https://www.walmart.com";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		String ActualTitle = "Walmart.com | Save Money. Live Better";
		String ExpectedTitle = driver.getTitle();
		
if (ActualCurrentUrl.equals(ExpectedCurrentUrl) && ActualTitle.equals(ExpectedTitle)){
	System.out.println("My url is correct");
} else {
	System.out.println("My url is not correct");
	
}

	
	
	}

}
