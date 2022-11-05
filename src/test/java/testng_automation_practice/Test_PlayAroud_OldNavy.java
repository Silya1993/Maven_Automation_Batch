package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAroud_OldNavy {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority = 1)
	public void openOldNavyWebsite() {
		driver.get("https://oldnavy.gap.com/");
	}
@Test(priority = 2)
public void clickOnNew() {
	driver.findElement(By.xpath("//a[text() = 'New!']")).click();
}

@Test(priority = 4)
public void clickOnGiftCard() {
	driver.findElement(By.xpath("//a[text() = 'Gift Card']")).click();
}

@Test(priority = 5)
public void clickOnFindStore() {
	driver.findElement(By.xpath("//a[text() = 'Find a store']")).click();
	
}
@Test(priority = 3)
public void clickOnBaby() {
	driver.findElement(By.xpath("//a[text() = 'Baby']")).click();
}
@AfterTest
public void treatDown(){
	driver.quit();
}
}
