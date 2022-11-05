package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAroundZara {
 
public static WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test
	public void OpenZARAWebsite() {
		driver.get("https://www.zara.com/us/");
		System.out.println("The Title of the page is :" + driver.getTitle());
	}
	@Test
	public void clickOnLOGIIN() {
		driver.findElement(By.xpath("//span[text() = 'LOG IN']")).click();
	}
	@Test
	public void clickOnSEARCH() {
		driver.findElement(By.xpath("//span[text() = 'Search']")).click();
	}
	@Test
	public void clickOnHELP() {
		driver.findElement(By.xpath("//span[text() = 'HELP']")).click();
	}
   @Test
   public void clickOnZARAlogo() {
	   driver.findElement(By.className("layout-header__left")).click();
   }
   @AfterTest
   public void treatDown() {
	   driver.quit();
   }
}
