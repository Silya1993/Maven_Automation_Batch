package automationfourth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Webelement_fb {
	// validate web elements
	// isDisplyed()
	// isEnable()
	// isSelected
	// open any browser and than - Ctrl+shift+ it will open Incognito Browser
	public static WebDriver driver;

	public static Select select;
	public static ChromeOptions options;

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

		// WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[text() =
		// 'Forgot password?']"));
		// System.out.println(forgotPasswordLink.isDisplayed());
		// System.out.println(forgotPasswordLink.isEnabled());
		// System.out.println(forgotPasswordLink.isSelected());

		String ActualUrl = "https://www.facebook.com/";
		String ExpectedUrl = driver.getCurrentUrl();
		String ActualTitle = "Facebook - log in or sign up";
		String ExpectedTitle = driver.getTitle();
		if (ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)) {
			System.out.println(" My Url is correct");
			System.out.println("My Title is correct");
		} else {
			System.out.println("My Url is incorrect ");
			System.out.println("My Title is incorrect");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement createaccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		if (createaccount.isDisplayed() && createaccount.isEnabled()) {
			System.out.println("createaccount button is displayed");
			System.out.println("createaccount button is enable");
			createaccount.click();
		} else {
			System.out.println("createaccount button is not displayed");
			System.out.println("createaccount button is not enabled");

		}

		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		if (firstname.isEnabled() == true && firstname.isDisplayed() == true) {
			firstname.sendKeys("Silya");

			System.out.println("Firstname is enable ");
			System.out.println("Firstname is displyed");

		} else {
			System.out.println("firstname is not enable or displyed");
		}
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		if (lastname.isEnabled() == true && lastname.isDisplayed() == true) {
			lastname.sendKeys("Akkouche");

			System.out.println("Lastname is enable ");
			System.out.println("Lastname is displyed");

		} else {
			System.out.println("lastname is not enable or displyed");
		}

		WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		if (email.isEnabled() == true && email.isDisplayed() == true) {
			email.sendKeys("silyaak93@gmail.com");

			System.out.println("email is enable ");
			System.out.println("email is displyed");

		} else {
			System.out.println("email is not enable or displyed");

		}
		WebElement Re_enteremail = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
		if (Re_enteremail.isEnabled() == true && Re_enteremail.isDisplayed() == true) {
			Re_enteremail.sendKeys("silyaak93@gmail.com");

			System.out.println(" Re_enteremail is enable ");
			System.out.println("Re_enteremail is displyed");
		} else {
			System.out.println("Re_enteremail is not enable or is not displyed");
		}

		WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
		if (password.isEnabled() == true && password.isDisplayed() == true) {
			password.sendKeys("Silya@1993");

			System.out.println("Password is enable ");
			System.out.println("Password is displyed");

		} else {
			System.out.println("the password is not enable or is not displyed");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");

		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("26");

		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1993");
		WebElement gender = driver.findElement(By.xpath("//label[text() = 'Female']"));
		gender.click();
		 driver.findElement(By.name("websubmit")).click();
		 
	

//select = new Select (driver.findElement(By.))

	}

}
