package tesng_automation_30_Oct;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriCombo {
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("This is BeforeMethod executing");
	}
  
	@Test
	public void testCase1() {
		driver.get("https://www.amazon.com/");
		System.out.println("Test case amazon");
		
	}
	@Test
	public void testCase2() {
		driver.get("https://www.google.com/");
		System.out.println("Test case google");
	}
	@Test
	public void testCase3() {
		driver.get("https://www.walgreens.com/");
		System.out.println("Test case walgreens");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("This is AfterMethod annotation");
		driver.quit();
	}
}
