package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAroundDTE {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void setUP() {
		driver.get("https://www.newlook.dteenergy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void clickOnResidential() {
		driver.findElement(By.className("active")).click();
	}
	@Test(priority = 3)
	public void clickOnBillingPaiment(){
		driver.findElement(By.className("dropdownMeganavTitle")).click();
	}
	@Test(priority = 4)
	public void clickOnSignin() {
		driver.findElement(By.xpath("//a[@class = 'dropdown-toggle dispinline']")).click();
	}
	@Test(priority = 5)
	public void enterUsername() {
		driver.findElement(By.id("inputEmailHome")).sendKeys("silyaak93@gmail.com");
	}

	@AfterTest
	public void treatDown() {
		driver.quit();
	}
}
