package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ConsumerEnergie {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority = 1)
	public void openConsumerEnergieWebsite() {
		driver.get("https://www.consumersenergy.com/");
		
	}
	@Test(priority = 2)
	public void clickOnContact() {
		driver.findElement(By.xpath("//DIV[@class = 'wp_contact-popover dropdown']/child::button[1]")).click();
	}
	@Test(priority = 3)
	public void clickOnPayBill() {
		driver.findElement(By.xpath("//div[@class = 'wp_pay_bill-popover dropdown']/child::button[1]")).click();
	}
	@Test(priority = 4)
	public void EnterUserID() {
		driver.findElement(By.name("userName")).sendKeys("Silya93");
	}
	
	@AfterTest
	public void treatDown() {
	driver.quit();	
	}

}
