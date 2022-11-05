package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAround_Express {
	
	public static WebDriver driver;
	 @BeforeTest
	 public void launchBrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 }
	 
	 @Test(priority = 1)
	 public void setUpExpress() {
		 driver.get("https://www.express.com/");
	 }
	 
	@Test(priority = 4)
	public void clickOnCreateAccount() {
		driver.findElement(By.className("FSewH")).click();
	}
	@Test(priority = 3)
	public void clickOnDetails() {
		driver.findElement(By.className("_8CIPI")).click();
		
	}
	@Test(priority =2 )
	public void clickOnExpressLogo() {
		driver.findElement(By.xpath("//div[@class = 'VZiu2']/descendant::img")).click();
	}
	
	
	@AfterTest
	public void treatDown() {
		driver.quit();
	}
	 }


