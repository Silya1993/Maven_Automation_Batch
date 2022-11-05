package practice_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	public static WebDriver Driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActualUrl = "https://www.facebook.com/";
		String ExpectedUrl = (driver.getCurrentUrl());
		String ActualTitle = "Facebook - log in or sign up";
		String ExpectedTitle = (driver.getTitle());
		
		if(ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)) {
			System.out.println("my url is correct");
			System.out.println("my title is correct");
			
		}else {
			System.out.println("my url is incorrect");
			System.out.println("my title is incorrect");
		}
		 driver.findElement(By.name("login")).click();
		 driver.findElement(By.id("email")).sendKeys("silyaak93@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("silyaakk");
	}

}
