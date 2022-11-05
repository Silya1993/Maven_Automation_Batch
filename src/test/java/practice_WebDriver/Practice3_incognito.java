package practice_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice3_incognito {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	public static Select select;

	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	   
	   driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
	   driver.findElement(By.name("firstname")).sendKeys("Silya");
	   driver.findElement(By.name("lastname")).sendKeys("Akkouche");
	   driver.findElement(By.name("reg_email__")).sendKeys("silyaak93@gmail.com");
	   driver.findElement(By.name("reg_email_confirmation__")).sendKeys("silyaak93@gmail.com");
	   driver.findElement(By.id("password_step_input")).sendKeys("silyaakk");
	   
	   select = new Select(driver.findElement(By.id("month")));
	   select.selectByVisibleText("Jan");
	   
	   select = new Select(driver.findElement(By.id("day")));
			   select.selectByVisibleText("26");
			   
			   select = new Select(driver.findElement(By.id("year")));
			   select.selectByVisibleText("1993");
			  
			   WebElement gender = driver.findElement(By.xpath("//label[text() = 'Female']"));
				gender.click();
				 driver.findElement(By.name("websubmit")).click();
		
		
	
	
	}
	
}
