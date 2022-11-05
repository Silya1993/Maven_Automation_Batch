package automationfourth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lp1 {
	public static WebDriver driver;

	@Test()
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		// getting title and current url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Actualurl = "https://www.facebook.com/";
		String Actualtitle = "Facebook - log in or sign up";
		String Expectedurl = driver.getCurrentUrl();
		String Expectedtitle = driver.getTitle();
		if (Actualtitle.equals(Expectedtitle) && Actualurl.equals(Expectedurl)) {
			System.out.println("Your Url is Correct");
			System.out.println("Your Title is Correct");
		} else {
			System.out.println("Your Url is not Correct");
			System.out.println("Your Title is not Correct");
		}
		// Clicking Create Account button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement createaccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		// createaccount.click();
		if (createaccount.isDisplayed() && createaccount.isEnabled()) {
			System.out.println("Crate account button is displayed");
			System.out.println("Crate account button is enabled");
			createaccount.click();
		} else {
			System.out.println("Crate account button is not displayed");
			System.out.println("Crate account button is not enabled");
		}
		// Inputing data
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		firstname.sendKeys("JOBAID");
		lastname.sendKeys("AZIM");
		WebElement emailmobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		emailmobile.sendKeys("jobaid@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement reenteremailmobile = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
		reenteremailmobile.sendKeys("jobaid@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		password.sendKeys("T345@534gfg");
		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']/option[5]"));
		WebElement day = driver.findElement(By.xpath("//select[@id = 'day']/option[18]"));
		WebElement year = driver.findElement(By.xpath("//option[text() = '1995']"));
		month.click();
		day.click();
		year.click();
		WebElement gender = driver.findElement(By.xpath("//label[text() = 'Male']"));
		gender.click();

		// Clicking the submit Button
		WebElement submit = driver.findElement(By.xpath("//button[@name = 'websubmit']"));
		if (submit.isDisplayed() && submit.isEnabled()) {
			System.out.println("Submit are Displayed & Enabled");
			submit.click();
			System.out.println("Registration Done");
			driver.close();
		} else {
			System.out.println("Submit aren't Displayed & Enabled");
		}
		driver.close();

	}

	@Test(dependsOnMethods = "test1")
	public void amazonTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		// Clicking Create Account button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement createaccount = driver.findElement(By.xpath("//a[text() = 'Account & Lists']"));
		createaccount.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement createnewaccount = driver.findElement(By.xpath("//a[@id = 'createAccountSubmit']"));
		createnewaccount.click();

	}

}
