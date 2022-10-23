package automationthird;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Shein {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://us.shein.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActualCurrentUrl = "https://us.shein.com";
		String ExpectCurrentUrl = (driver.getCurrentUrl());
		
		String ActualTitle = "Women's Clothing, Women Fashion Sale | SHEIN USA";
		String ExpectedTitle =(driver.getTitle());
		
		if(ActualCurrentUrl.equals(ExpectCurrentUrl) && ActualTitle.equals(ExpectedTitle)) {
			System.out.println("My url is correct");
		}else {
			System.out.println("my url is incorrect");
			
		}
	}
}
	