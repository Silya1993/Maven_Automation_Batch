package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAroundwalgreens {
    
	public static WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void OpenWelgreensWebsite() {
		driver.get("https://www.walgreens.com/");
		System.out.println("The Title of the page is :" + driver.getTitle());
	}
	@Test
	public void clickOnMenu() {
		driver.findElement(By.xpath("//strong[text() = 'Menu']")).click();
	}
	@Test
	public void clickOnSearchBox() {
		driver.findElement(By.id("ntt-placeholder")).click();
	}
	@Test
	public void clickOncart() {
		driver.findElement(By.id("pf-icon__cart")).click();
		
	}
	@Test
	public void clickOnSechedulevaccin() {
		driver.findElement(By.xpath("//strong[text() = 'Schedule vaccine']")).click();
	}
	@AfterTest
	public void treatDown() {
		driver.quit();
	}
}
