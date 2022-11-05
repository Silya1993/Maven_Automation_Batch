package automation_29_oct;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_screenshot {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");

		WebElement openWeathershot = driver.findElement(By.xpath("//div[@class = 'section where-to']"));

		File source = openWeathershot.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\silya\\eclipse-workspace\\AUTOMATION-BATCH\\screenshot\\screenshot1.png");
		FileHandler.copy(source, Destination);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.hm.com/entrance.ahtml");

		WebElement shaadiBaner = driver.findElement(By.className("content-wrapper-middle"));
		File source1 = shaadiBaner.getScreenshotAs(OutputType.FILE);
		File Destination1 = new File ("C:\\Users\\silya\\eclipse-workspace\\AUTOMATION-BATCH\\screenshot\\screenshot2.png");
		FileHandler.copy(source1, Destination1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.wellsfargo.com/");
		
		WebElement wellsfargo = driver.findElement(By.className("marquee-img"));
	File source2 = wellsfargo.getScreenshotAs(OutputType.FILE);
	File destination2 = new File("C:\\Users\\silya\\eclipse-workspace\\AUTOMATION-BATCH\\screenshot\\screenshot3.png");
	FileHandler.copy(source2, destination2);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.express.com/");
	
	WebElement Express = driver.findElement(By.className("text-snipe-outer"));
	File source3 = Express.getScreenshotAs(OutputType.FILE);
	File Destinition3 = new File("C:\\Users\\silya\\eclipse-workspace\\AUTOMATION-BATCH\\screenshot\\screenshot4.png");
	FileHandler.copy(source3, Destinition3);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://corporate.target.com/article/2022/07/esg-report");
	
	WebElement Target = driver.findElement(By.xpath("//div[@class = 'photo']/child::img[1]"));
	File source4 = Target.getScreenshotAs(OutputType.FILE);
	File Distination4 = new File("C:\\Users\\silya\\eclipse-workspace\\AUTOMATION-BATCH\\screenshot\\screenshot5.png");
	FileHandler.copy(source4, Distination4);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.cvs.com/");
	
	WebElement cvs = driver.findElement(By.className("hero-text"));
	File source5 = cvs.getScreenshotAs(OutputType.FILE);
	File Distination5 = new File ("C:\\Users\\silya\\eclipse-workspace\\AUTOMATION-BATCH\\screenshot\\screenshot6.png");
	FileHandler.copy(source5, Distination5);
	
	
	}

}
