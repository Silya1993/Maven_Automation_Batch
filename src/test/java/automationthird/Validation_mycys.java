package automationthird;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_mycys {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.macys.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActualCurrentUrl = "https://www.macys.com/";
		String ExpectedCurrentUrl =(driver.getCurrentUrl());
		String ActualTitle = "Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
		String ExpectedTitle =(driver.getTitle());
		
		if(ActualCurrentUrl.equals(ExpectedCurrentUrl) && ActualTitle.equals(ExpectedTitle)) {
			
		System.out.println("my url is correct");
		System.out.println("my title is correct");
		}else {
			System.out.println("my url is incorrect");
			System.out.println("my title is incorrect");
			
		}
		
		
	}

}
