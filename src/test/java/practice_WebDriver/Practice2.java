package practice_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		  
		String ActualUrl = "https://www.amazon.com/";
		String ExpectedUrl = (driver.getCurrentUrl());
		String ActualTitle = "Amazon.com. Spend less. Smile more.";
		String ExpectedTitle = (driver.getTitle());
		if(ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)) {
			System.out.println("ActualUrl is correct");
			System.out.println("ActualTitle is correct");
		
		}else {
			System.out.println("Actualurl is incorrect");
			System.out.println("actualtitle is incorrect");
		}
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		if(searchbox.isEnabled() == true && searchbox.isDisplayed() == true) {
			searchbox.click();
			System.out.println("searchbox is enable and is displyed");
		}else {
			System.out.println("searchbox is not enable or is not displyed");
		}
		
		
	}

}
