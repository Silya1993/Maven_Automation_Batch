package automationthird;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_xpath_1 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//a[@class = 'mailicon']")).click();
		driver.findElement(By.xpath("']")).click();
		driver.findElement(By.xpath("//a[@class = 'bmailicon relative']")).click();
		driver.findElement(By.xpath("//a[@class = 'vdicon']")).click();
		driver.findElement(By.xpath("//a[@class = 'shopicon relative']")).click();
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Account']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		
	}

}
