package tesng_automation_30_Oct;

import org.testng.annotations.*;

public class Execution_preiorities {

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Testing @BeforeSuite annotation");
  }
		  
	@BeforeTest
	public void beforeTest() {
		System.out.println("Testin @BeforeTest annotation");
	}
	@BeforeClass 
	public void beforeClass(){
		System.out.println("Testing @BeforeClass annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testing @BeforeMethod annotation");
	}
	@Test
	public void testCase() {
		System.out.println("My corde is working well");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Testing @AfterSuite annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Testing @AfterTest annotation");
	}
	@AfterClass
	public void afterClass () {
		System.out.println("Testing @AfterClass annotation");
	}
   @AfterMethod
   public void afterMethod () {
	   System.out.println("Testin @AfterMethod annotation");
   }
  }


