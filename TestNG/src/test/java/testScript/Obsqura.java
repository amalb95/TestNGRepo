package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Obsqura extends Base{
	@Test
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement color = driver.findElement(By.id("single-input-field"));
		Select select = new Select(color);
		select.selectByValue("Red");
	}
	
	@Test
	public void alertExample() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simple.click();
		driver.switchTo().alert().accept();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Obsqura");
		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		//frame
		//window
		//action
		
	}
	
	
	@Test
	public void show() {
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		WebElement multi = driver.findElement(By.id("demo-multiple-select"));
		Select select = new Select(multi);
		select.selectByVisibleText("Health & Beauty");
		select.selectByVisibleText("Movies, Music & Games");
		Assert.assertEquals(multi.getText(), null, "Amal");
	}
}
