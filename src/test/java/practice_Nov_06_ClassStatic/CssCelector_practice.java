package practice_Nov_06_ClassStatic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssCelector_practice {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void clickOnSignIn() throws Exception {
		driver.findElement(By.cssSelector("a.moneyicon.relative")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class = signin]")).click();
	}

	@AfterTest
	public void tearDown() {
		 driver.quit();
	}
	}


