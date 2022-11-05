package automationfourth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advenced_Xpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://us.shein.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//String ActualUrl = "https://www.amazon.com/";
		//String ExpectedUrl = driver.getCurrentUrl();
		//String ActualTitle = "Amazon.com. Spend less. Smile more.";
		//String ExpectedTitle = driver.getTitle();
		
		//if(ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)) {
		
		//System.out.println("my url is correct");
		//System.out.println("my title is correct");
		//}else {	
		//	System.out.println("my url is not correct");
			//System.out.println("my title is not correct");
	
//	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//header[@class = 'c-header j-c-header1']/descendant::div[@class = 'config-wrap-center']")).click();
	}	
}