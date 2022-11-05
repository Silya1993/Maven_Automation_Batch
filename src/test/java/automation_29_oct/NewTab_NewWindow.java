package automation_29_oct;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.zara.com/us/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.walmart.com/");

		
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.wellsfargo.com/");
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://www.costco.com/");
		 
      openWindow();
	driver.quit();	}
  
	static void openWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");

		
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://www.amazon.com");
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://www.costco.com");
		 driver.quit();
	}
}
