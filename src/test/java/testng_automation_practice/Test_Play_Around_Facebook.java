package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Play_Around_Facebook {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test(priority = 1)
	public void setUpfacebook() {
		driver.get("https://www.facebook.com/login/");
	}
	@Test(priority = 2)
	public void clickOnCreatAccount() {
		driver.findElement(By.xpath("//div[@id = 'login_link']/descendant::a[2]")).click();
	}
	
	@Test(priority = 3)
	public void enterFirstname() {
		driver.findElement(By.name("firstname")).sendKeys("Silya");
	}
	
	@Test(priority = 4)
	public void enterLastname() {
		driver.findElement(By.name("lastname")).sendKeys("Akkouche");
	}
	
	@Test(priority = 5)
	public void enterEmailAdress() {
		driver.findElement(By.name("reg_email__")).sendKeys("silyaak93@gmail.com");
	}
	@AfterTest
	public void treatDown() {
		driver.quit();
	}

}
