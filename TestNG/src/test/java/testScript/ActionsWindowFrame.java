package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsWindowFrame extends Base{
	@Test
	public void actions() {
		driver.navigate().to("https://webdriveruniversity.com/Actions/index.html");
		WebElement doubleclick = driver.findElement(By.xpath("//h2[text()='Double Click Me!']"));
		Actions action = new Actions(driver);
		action.moveToElement(doubleclick);
		action.doubleClick().build().perform();
	}
	
	@Test
	public void frames() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame(driver.findElement(By.id("a077aa5e")));
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	}
	
	@Test
	public void window() {
		driver.navigate().to("https://webdriveruniversity.com/index.html");
		driver.findElement(By.xpath("//h1[text()='CONTACT US']")).click();
		driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']")).click();
		Set<String> pages = driver.getWindowHandles();
		for(String handle:pages) {
			driver.switchTo().window(handle);
		}
	}
}
