package automationthird;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reddif_xpath_2 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		//driver.findElement(By.xpath("//a[contains(@class, 'mailicon')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Money')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Business Email')]")).click();
		//driver.findElement(By.xpath("//a[contains(@class, 'vdicon')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Shopping')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Create Account')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@class, 'signinbtn')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'rd_logout')]")).click();

	}

}
