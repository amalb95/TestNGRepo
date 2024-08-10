package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions extends Base{
	
	@Test
	public void assertEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring = driver.getTitle();
		System.out.println(actualstring);
		String expected = " Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring, expected);
	}
	
	@Test
	public void assertNotEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring = driver.getTitle();
		System.out.println(actualstring);
		String expected = "Most App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring, expected);
	}
	
	@Test
	public void assertTrueTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(verifytitle);
	}
	
	@Test
	public void assertFalseTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle = driver.getTitle().equalsIgnoreCase("Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(verifytitle);
	}
	
	@Test
	public void assertNullTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String verifyassert = null;
		Assert.assertNull(verifyassert);
	}
	
	@Test
	public void assertNotNullTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifyassert = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertNotNull(verifyassert);
	}
}
