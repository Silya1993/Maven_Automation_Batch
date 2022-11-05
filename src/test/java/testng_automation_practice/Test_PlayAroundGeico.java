package testng_automation_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_PlayAroundGeico {

 public static WebDriver driver;
 @BeforeTest
 public void launchBrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
 }
 @Test(priority = 1)
 public void setUpGeico() {
	 driver.get("https://www.geico.com");
	 System.out.println("The Title of the page is :" + driver.getTitle());
 }
 @Test(priority = 2)
 public void clickOnZipCode() {
	 driver.findElement(By.id("ssp-service-zip")).click();
 }
 @Test(priority = 4)
 public void clickOnGO() {
	 driver.findElement(By.xpath("//input[@class = 'btn btn--secondary']")).click();
 }
 @Test(priority = 5)
 public void clickOnStartMyQote() {
	 driver.findElement(By.xpath("//a[text() = 'Start My Quote']")).click();
 }
 @Test(priority = 3)
 public void clickOnLogoGeico() {
	 driver.findElement(By.className("icon-geico")).click();
 }
 @AfterTest
 public void treatDown(){
	 driver.quit();
	 
 }
}
