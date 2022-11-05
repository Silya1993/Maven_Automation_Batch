package tesng_automation_30_Oct;

import org.testng.annotations.Test;

public class Priority_A_Value {
 
	@Test(priority = 5)
	public void testCase1() {
		System.out.println("Test Case 1");
		
	}
	@Test(priority = 1)
	public void testCase2() {
		System.out.println("Test Case 2");
		
	}
	@Test(priority = 4)
	public void testCase3() {
		System.out.println("Test Case 3");
		
	}
	@Test(priority = 2, enabled = false)
	public void testCase4() {
		System.out.println("Test Case 4");
		
	}
	@Test(priority = 3,invocationCount = 3)
	public void testCase5() {
		System.out.println("Test Case 5");
		
	}
}
