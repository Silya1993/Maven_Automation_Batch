package automationfourth;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_practice1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com");
		
		//List <WebElement> allDivTags =   driver.findElements(By.tagName("Div"));
		
		//System.out.println(allDivTags.size());
		
		
		//WebElement passwordTextbox = driver.findElement(By.id("password"));
		//System.out.println(passwordTextbox.getTagName());
		   
		//WebElement rediffmailLink = driver.findElement(By.className("mailicon"));
		//System.out.println(rediffmailLink.getTagName());
		
	//driver.findElement(By.className("signin")).click();
	//or by linktext
	//driver.findElement(By.linkText("sign in")).click();
	driver.findElement(By.partialLinkText("create acc")).click();
	}
}
