package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAroundCostco {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority = 1)
	public void OpenWelgreensWebsite() {
		driver.get("https://www.costco.com/");
		System.out.println("The Title of the page is :" + driver.getTitle());
	}
	@Test(priority = 4)
	public void clickOnSignin() {
		driver.findElement(By.id("header_sign_in")).click();
	}
	@Test(priority = 5)
	public void enterUsername() {
		driver.findElement(By.id("signInName")).sendKeys("silyaak93@gmail.com");
	}
	@Test(priority = 3)
	public void clickOnDeals() {
		driver.findElement(By.className("nav-flyout")).click();
	}
	@Test(priority =2)
	public void clickOnRecord() {
		driver.findElement(By.className("nav-flyout")).click();
	}
	
	
	@AfterTest
	public void treatDown() {
		driver.quit();
	}
}
