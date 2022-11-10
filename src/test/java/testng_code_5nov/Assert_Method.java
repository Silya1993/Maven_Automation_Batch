package testng_code_5nov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Method {

	public static WebDriver driver;

	@Test
	public void launchRediff() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");
		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled());
		driver.findElement(By.className("signin")).click();
		
		    String currentTitle = driver.getTitle();
	        String currentUrl = driver.getCurrentUrl();
	
		    System.out.println(driver.getTitle()); //Rediffmail
	        System.out.println(driver.getCurrentUrl()); //https://mail.rediff.com/cgi-bin/login.cgi
	        
	        Assert.assertEquals(currentTitle, "Rediffmail");
	        Assert.assertEquals(currentUrl, "https://mail.rediff.com/cgi-bin/login.cgi");
	        
	        driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	        Assert.assertTrue(true);
	        
	        WebElement password = driver.findElement(By.id("password"));
	        Assert.assertTrue(password.isEnabled());
	        password.sendKeys("Selenium@123");
	        
	        WebElement signin = driver.findElement(By.name("proceed"));
	        Assert.assertTrue(signin.isEnabled());
	        signin.click();
	        
	        WebElement logout = driver.findElement(By.className("rd_logout"));
	        Assert.assertTrue(logout.isEnabled());
	        logout.click();
	        
	       WebElement homepage =  driver.findElement(By.xpath("//div[@class = 'new_container']/descendant::b"));
	        Assert.assertTrue (homepage.isEnabled());
	        homepage.click();
	        
			/*
			 * Assert.assertTrue(false); 
			 * Assert.assertEquals(false, null);
			 * Assert.assertNotEquals(null, null); 
			 * Assert.assertFalse(false);
			 * Assert.fail();
			 */
	        
	        
		}

	
	}
	

	
