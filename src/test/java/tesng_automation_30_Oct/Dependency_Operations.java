package tesng_automation_30_Oct;

import org.junit.Assert;
import org.testng.annotations.Test;



public class Dependency_Operations {
 
	@Test
	public void testCase1() {
		System.out.println("Test case 1");
		Assert.fail("Deliberately failing to show my studend");//we fail the testcase1
		
	}
	@Test(dependsOnMethods =" testCase1" , alwaysRun = true)//it will run even is depend on testcase1 witch is failed test2 will be run
	public void testCase2() {
		System.out.println("Test case 2");
		
		
		
	}
	@Test(dependsOnMethods = {"testCase1,testCase2"})
	public void testCase3() {
		System.out.println("Test case 3");//will skip
		
		
		
	}
	@Test(dependsOnMethods = {"tesrCase1,testCase2,testCase3"})
	public void testCase4() {
		System.out.println("Test case 4");
		
		
		
	}
	@Test(dependsOnMethods = {"testCase1,testCase2,testCase3,testCase4"})
	public void testCase5() {
		System.out.println("Test case 5");
	}
}
