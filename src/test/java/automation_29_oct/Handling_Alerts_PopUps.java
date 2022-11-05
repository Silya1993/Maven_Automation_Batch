package automation_29_oct;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Alerts_PopUps {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
		driver.findElement(By.className("signinbtn")).click();
	
		 
		//Alert is interface not a class
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("text of the alert is :" + text);
		
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		 
		
	}
	
	

}
