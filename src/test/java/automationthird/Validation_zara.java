package automationthird;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_zara {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zara.com/us");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActuaCurrentUrl = "https://www.zara.com/us";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		
		String ActualTitle = "ZARA United States | New Collection Online";
		String ExpectedTitle = driver.getTitle();
		
        if (ActuaCurrentUrl.equals(ExpectedCurrentUrl) && ActualTitle.equals(ExpectedTitle)){
		
	System.out.println("My Url is correct");
        }else {
        	System.out.println("My Url is incorrect");
		}
	}

}
