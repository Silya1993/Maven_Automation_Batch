package automationpractice_Csscelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationpractice_Using_Csscelector {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;

	@BeforeTest
	public void launchAutomationPractice() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(priority = 1)
	public void clickOnSignin() {
		WebElement signIn = driver.findElement(By.cssSelector("a[class = login]"));
		softassert.assertTrue(signIn.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
		softassert.assertAll();
	}

	@Test(priority = 2)
	public void enterEmailAddress() {
		WebElement emailAddress = driver.findElement(By.cssSelector("input#email_create"));
		softassert.assertTrue(emailAddress.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(emailAddress)).sendKeys("silyaak93@gmail.com");
		softassert.assertAll();
	}

	@Test(priority = 3)
	public void clickOnCreateAccount() {
		WebElement createaccount = driver.findElement(By.cssSelector("button#SubmitCreate>span:nth-child(1)"));
		softassert.assertTrue(createaccount.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createaccount)).click();
		softassert.assertAll();
	}

	@Test(priority = 4)
	public void clickOnGender() {
		WebElement gender = driver.findElement(By.cssSelector("input#id_gender2"));
		softassert.assertTrue(gender.isSelected());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(gender)).click();
		softassert.assertAll();

	}

	@Test(priority = 5)
	public void enterFirstname() {
		WebElement firstname = driver.findElement(By.cssSelector("input#customer_firstname"));
		softassert.assertTrue(firstname.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(firstname)).sendKeys("Silya");
		softassert.assertAll();
	}

	@Test(priority = 6)
	public void enterLastName() {
		WebElement lastname = driver.findElement(By.cssSelector("input[id =customer_lastname]"));
		softassert.assertTrue(lastname.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lastname)).sendKeys("Akkouche");
		softassert.assertAll();
	}

	@Test(priority = 7)
	public void enterPassword() {
		WebElement password = driver.findElement(By.cssSelector("#passwd"));
		softassert.assertTrue(password.isEnabled());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("silya@1993");
		softassert.assertAll();

	}

	@Test(priority = 8)
	public void enterDateOfBirth() {
		WebElement Day = driver.findElement(By.cssSelector("select#days>option:nth-child(27)"));
		WebElement Month = driver.findElement(By.cssSelector("select#months>option:nth-child(2)"));
		WebElement Year = driver.findElement(By.cssSelector("select#years>option:nth-child(31)"));
		softassert.assertTrue(Day.isSelected());
		softassert.assertTrue(Month.isSelected());
		softassert.assertTrue(Year.isSelected());

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Day)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Month)).click();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Year)).click();

		softassert.assertAll();
	}

	@Test(priority = 9)
	public void clickOnRegister() {
		WebElement Registerlink = driver.findElement(By.cssSelector("button#submitAccount>span"));
		softassert.assertTrue(Registerlink.isDisplayed());
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Registerlink)).click();
		softassert.assertAll();
	}

}
