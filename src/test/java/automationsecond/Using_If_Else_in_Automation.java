package automationsecond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_If_Else_in_Automation {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		String Browser = "Chrome";
		
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		}else if (Browser.equals("Firefox")) {
        WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://flipcart.com");
		driver1.manage().window().maximize();
		
		}else if (Browser.equals("Edge")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://amazon.com");
		

		}else {	
			System.out.println("None of the browser works");
			
		}
	}

}
