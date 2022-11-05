package tesng_automation_30_Oct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayAround {
	public static WebDriver driver;
 
	@BeforeTest
	public void launchBrowser () {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	} 
	@Test
	public void SetUP() {
	driver.get("https://www.amazon.com");
	System.out.println("The title of the page is :" + driver.getTitle());
	}
	
	@Test
	public void clickOnSelectAddress() {
		driver.findElement(By.id("glow-ingress-line2")).click();
	}
	
	
	@Test

	public void clickOnKeywords() {
		driver.findElement(By.name("field-keywords")).click();
	}
   
    @Test
    public void clickOnAllButton() {
    	driver.findElement(By.xpath("//i[@class = 'hm-icon nav-sprite']")).click();
    }
   
    @Test
    public void clickOnCustomerService() {
    	driver.findElement(By.xpath("//div[@id = 'nav-xshop']/child::a[4]")).click();
    }
    
    @AfterTest
    public void treatDown() {
    	driver.quit();
    }
  
   }
