package testScript;

import org.testng.annotations.Test;

public class TestProgram extends Base{
	
	@Test(priority=3)
	public void testOne() {
		System.out.println("Test one method");
	}
	@Test(priority=1)
	public void testTwo() {
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	@Test(priority=2)
	public void testThree() {
		driver.navigate().to("https://www.youtube.com");
		System.out.println(driver.getTitle());
	}

}
