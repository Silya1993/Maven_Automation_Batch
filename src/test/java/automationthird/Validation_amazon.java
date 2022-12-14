package automationthird;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Validation_amazon {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
		
		String actualCurrentUrl = "https://www.amazon.com/";
		
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Amazon.com. Spend less. Smile more.";
		String expectedTitle = driver.getTitle();
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) && actualTitle.equals(expectedTitle)){
			
			System.out.println("My url is correct");
			System.out.println("My title is correct");
		} else {
			System.out.println("My url is not correct");
			System.out.println("My Title is not correct");
		}
		
		driver.quit();
		
	}

}
