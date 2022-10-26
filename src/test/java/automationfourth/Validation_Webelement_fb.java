package automationfourth ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Webelement_fb {
	// validate web elements
	// isDisplyed()
	// isEnable()
	// isSelected
	// open any browser and than - Ctrl+shift+ it will open Incognito Browser
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());

	//	WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[text() = 'Forgot password?']"));
	//	System.out.println(forgotPasswordLink.isDisplayed());
		//System.out.println(forgotPasswordLink.isEnabled());
		//System.out.println(forgotPasswordLink.isSelected());

		String ActualUrl = "https://www.facebook.com/";
		String ExpectedUrl = driver.getCurrentUrl();
		String ActualTitle = "Facebook - log in or sign up";
		String ExpectedTitle = driver.getTitle();
		 if(ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)) {
			 System.out.println(" My Url is correct");
			 System.out.println("My Title is correct");
		 }else {
			 System.out.println("My Url is incorrect ");
			 System.out.println("My Title is incorrect");
		 } 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 WebElement createaccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
			if(createaccount.isDisplayed()&& createaccount.isEnabled() ) {
				System.out.println("createaccount button is displayed");
				System.out.println("createaccount button is enable");
				createaccount.click();
			}else {
				System.out.println("createaccount button is not displayed");
				System.out.println("createaccount button is not enabled");
				
					}
		 
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		if(firstname.isEnabled() == true && firstname.isDisplayed() == true) {
			firstname.sendKeys("Silya");
			
		}else {
			System.out.println("firstname is not enable or displyed");
		}
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	if(lastname.isEnabled() == true && lastname.isDisplayed() == true) {
		lastname.sendKeys("Akkouche");
		
		}else {
			System.out.println("lastname is not enable or displyed");
		}

	WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
	if(email.isEnabled() == true && email.isDisplayed() == true) {
		email.sendKeys("silyaak93@gmail.com");
		
	}else {
		System.out.println("email is not enable or displyed");
		
	}
	WebElement Re_enteremail = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
	if(Re_enteremail.isEnabled() == true && Re_enteremail.isDisplayed() == true) {
		Re_enteremail.sendKeys("silyaak93@gmail.com");
	}else {
		System.out.println("Re_enteremail is not enable or is not displyed");
	}
	
WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
if(password.isEnabled() == true && password.isDisplayed() == true) {
	password.sendKeys("Silya@1993");
	
}else {
	System.out.println("the password is not enable or is not displyed");
}
WebElement BirthdayMonth = driver.findElement(By.xpath("//*[@id=\"month\"]/option[1]"));
if(BirthdayMonth.isEnabled()== true && BirthdayMonth.isDisplayed() == true) {
	BirthdayMonth.click();
}else {
	System.out.println("BirthdayMonth is not enablr or is not  displyed");
}
WebElement BirhtdayDay = driver.findElement(By.xpath("//*[@id=\"day\"]/option[26]"));
if(BirhtdayDay.isEnabled()== true && BirhtdayDay.isDisplayed() == true) {
	BirhtdayDay.click();
	
}else {
	System.out.println("the BirthdaDay is not enable or is not Displyed");
	
}
WebElement BirthdayYear = driver.findElement(By.xpath("//*[@id=\"year\"]/option[30]"));
if(BirthdayYear.isEnabled() == true && BirthdayYear.isDisplayed() == true) {
	BirthdayYear.click();
}else {
	System.out.println("BirthdayYear is not enable or is not displyed");
	
}
WebElement Gender = driver.findElement(By.xpath("//*[text() = 'Female']"));
if(Gender.isEnabled() == true && Gender.isDisplayed() == true) {
	Gender.click();
	
}else {
	System.out.println("Gender is not enable or is nor displyed");
}
	}
		
	}


