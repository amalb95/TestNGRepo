package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNGAssignment extends Base{
	
	@Test
	public void actionsExample() {
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy = driver.findElement(By.xpath("//span[text()='Delete']"));
		action.contextClick(rightclick).build().perform();
		copy.click();
		driver.switchTo().alert().accept();
		action.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).build().perform();
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void menuExample() {
		driver.navigate().to("https://demoqa.com/menu/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Main Item 2']"))).build().perform();
	}
	
	@Test
	public void droppableExample() {
		driver.navigate().to("https://demoqa.com/droppable");
		Actions actions = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.moveToElement(drag).build().perform();
		actions.doubleClick(drag).build().perform();
		actions.dragAndDrop(drag, drop).build().perform();
	}
	
	@Test
	public void registerExample() {
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		WebElement gender = driver.findElement(By.id("gender-male"));
		WebElement fname = driver.findElement(By.id("FirstName"));
		WebElement lname = driver.findElement(By.id("LastName"));
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		WebElement register = driver.findElement(By.id("register-button"));
		gender.click();
		fname.sendKeys("Ajay");
		lname.sendKeys("Sharma");
		email.sendKeys("ajay@email.com");
		password.sendKeys("ajay123");
		confirmpassword.sendKeys("ajay123");
		register.click();
	}
	
	@Test
	public void dropdownExample() {
		driver.navigate().to("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		WebElement dropdown = driver.findElement(By.xpath("//select[@country-data-region-id='gds-cr-one']"));
		Select select = new Select(dropdown);
		select.selectByValue("India");
	}
	
	@Test
	public void checkboxExample() {
		driver.navigate().to("https://total-qa.com/checkbox-example/#google_vignette");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement box:checkbox) {
			box.click();
		}
	}
	
	@Test
	public void alertExample() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		WebElement simple = driver.findElement(By.id("alertBox"));
		simple.click();
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.id("confirmBox"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.id("promptBox"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Amal");
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void framesExample() {
		driver.navigate().to("https://www.dezlearn.com/nested-iframes-example/");
		driver.switchTo().frame(driver.findElement(By.id("parent_iframe")));
		WebElement parentbutton = driver.findElement(By.id("u_5_5"));
		parentbutton.click();
		driver.switchTo().frame(driver.findElement(By.id("iframe1")));
		WebElement childbutton = driver.findElement(By.id("u_5_6"));
		childbutton.click();
	}
	
	@Test
	public void formSmarts() {
		driver.navigate().to("https://formsmarts.com/html-form-example");
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebElement fname = driver.findElement(By.id("u_l5z_4607"));
		fname.sendKeys("Ajay");
		WebElement lname = driver.findElement(By.id("u_l5z_338354"));
		lname.sendKeys("Jadeja");
		WebElement email = driver.findElement(By.id("u_l5z_4608"));
		email.sendKeys("ajay@email.com");
		WebElement dropdown = driver.findElement(By.id("u_l5z_338367"));
		Select select = new Select(dropdown);
		select.selectByValue("Support Inquiry");
		WebElement inquiry = driver.findElement(By.id("u_l5z_4609"));
		inquiry.sendKeys("No Comments");
		WebElement button = driver.findElement(By.xpath("//input[@value='Continue →']"));
		button.click();
	}
	
	@Test
	public void techListic() {
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement gender = driver.findElement(By.id("sex-0"));
		WebElement exp = driver.findElement(By.id("exp-2"));
		WebElement date = driver.findElement(By.id("datepicker"));
		List<WebElement> profession = driver.findElements(By.xpath("//input[@name='profession']"));
		List<WebElement> tools = driver.findElements(By.xpath("//input[@name='tool']"));
		WebElement continent = driver.findElement(By.id("continents"));
		WebElement selenium = driver.findElement(By.id("selenium_commands"));
		WebElement image = driver.findElement(By.id("photo"));
		WebElement button = driver.findElement(By.id("submit"));
		fname.sendKeys("Ajay");
		lname.sendKeys("Jadeja");
		gender.click();
		exp.click();
		date.sendKeys("12/07/1995");
		for(WebElement pro:profession) {
			pro.click();
		}
		for(WebElement tool:tools) {
			tool.click();
		}
		Select select = new Select(continent);
		select.selectByVisibleText("Asia");
		Select select1 = new Select(selenium);
		select1.selectByVisibleText("WebElement Commands");
		image.sendKeys("D:\\Downloads\\1cbf081fd20b42759519e44ddffb5bab_crop_north.jpg");
		button.click();
	}
	
	@Test
	public void roboForm() {
		driver.navigate().to("https://www.roboform.com/filling-test-all-fields");
		WebElement title = driver.findElement(By.xpath("//input[@name='01___title']"));
		title.sendKeys("Ajay");
		WebElement fname = driver.findElement(By.xpath("//input[@name='02frstname']"));
		fname.sendKeys("Ajay");
		WebElement mname = driver.findElement(By.xpath("//input[@name='03middle_i']"));
		mname.sendKeys("Sam");
		WebElement lname = driver.findElement(By.xpath("//input[@name='04lastname']"));
		lname.sendKeys("Jadeja");
		WebElement fullname = driver.findElement(By.xpath("//input[@name='04fullname']"));
		fullname.sendKeys("Ajay Sam Jadeja");
		WebElement company = driver.findElement(By.xpath("//input[@name='05_company']"));
		company.sendKeys("Pivot");
		WebElement position = driver.findElement(By.xpath("//input[@name='06position']"));
		position.sendKeys("ASE");
		WebElement addr1 = driver.findElement(By.xpath("//input[@name='10address1']"));
		addr1.sendKeys("334 Nila");
		WebElement addr2 = driver.findElement(By.xpath("//input[@name='11address2']"));
		addr2.sendKeys("Kazhakoottam");
		WebElement city = driver.findElement(By.xpath("//input[@name='13adr_city']"));
		city.sendKeys("Trivandrum");
		WebElement state = driver.findElement(By.xpath("//input[@name='14adrstate']"));
		state.sendKeys("Kerala");
		WebElement country = driver.findElement(By.xpath("//input[@name='15_country']"));
		country.sendKeys("India");
		WebElement zip = driver.findElement(By.xpath("//input[@name='16addr_zip']"));
		zip.sendKeys("695581");
		WebElement homep = driver.findElement(By.xpath("//input[@name='20homephon']"));
		homep.sendKeys("335467");
		WebElement workp = driver.findElement(By.xpath("//input[@name='21workphon']"));
		workp.sendKeys("778541");
		WebElement faxp = driver.findElement(By.xpath("//input[@name='22faxphone']"));
		faxp.sendKeys("996523");
		WebElement cellp = driver.findElement(By.xpath("//input[@name='23cellphon']"));
		cellp.sendKeys("9652415785");
		WebElement email = driver.findElement(By.xpath("//input[@name='24emailadr']"));
		email.sendKeys("ajay@email.com");
		WebElement website = driver.findElement(By.xpath("//input[@name='25web_site']"));
		website.sendKeys("www.ajay.com");
		WebElement userid = driver.findElement(By.xpath("//input[@name='30_user_id']"));
		userid.sendKeys("ajay123");
		WebElement password = driver.findElement(By.xpath("//input[@name='31password']"));
		password.sendKeys("ajay123");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='40cc__type']")));
		select.selectByValue("9");
		WebElement ccno = driver.findElement(By.xpath("//input[@name='41ccnumber']"));
		ccno.sendKeys("4569856333251542");
		WebElement cvc = driver.findElement(By.xpath("//input[@name='43cvc']"));
		cvc.sendKeys("985");
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='42ccexp_mm']")));
		select1.selectByValue("6");
		Select select2 = new Select(driver.findElement(By.xpath("//select[@name='43ccexp_yy']")));
		select2.selectByValue("2025");
		WebElement ccname = driver.findElement(By.xpath("//input[@name='44cc_uname']"));
		ccname.sendKeys("Ajay Sam Jadeja");
		WebElement bank = driver.findElement(By.xpath("//input[@name='45ccissuer']"));
		bank.sendKeys("ICICI Bank");
		WebElement custphone = driver.findElement(By.xpath("//input[@name='46cccstsvc']"));
		custphone.sendKeys("7785414523");
		WebElement gender = driver.findElement(By.xpath("//input[@name='60pers_sex']"));
		gender.sendKeys("Male");
		WebElement ssno = driver.findElement(By.xpath("//input[@name='61pers_ssn']"));
		ssno.sendKeys("74521");
		WebElement license = driver.findElement(By.xpath("//input[@name='62driv_lic']"));
		license.sendKeys("KL74521");
		Select select3 = new Select(driver.findElement(By.xpath("//select[@name='66mm']")));
		select3.selectByValue("8");
		Select select4 = new Select(driver.findElement(By.xpath("//select[@name='67dd']")));
		select4.selectByValue("11");
		Select select5 = new Select(driver.findElement(By.xpath("//select[@name='68yy']")));
		select5.selectByValue("1996");
		WebElement age = driver.findElement(By.xpath("//input[@name='66pers_age']"));
		age.sendKeys("35");
		WebElement place = driver.findElement(By.xpath("//input[@name='67birth_pl']"));
		place.sendKeys("Alappuzha");
		WebElement income = driver.findElement(By.xpath("//input[@name='68__income']"));
		income.sendKeys("1000000");
		WebElement message = driver.findElement(By.xpath("//input[@name='71__custom']"));
		message.sendKeys("Hello");
		WebElement comments = driver.findElement(By.xpath("//input[@name='72__commnt']"));
		comments.sendKeys("Hello");
		WebElement gotit = driver.findElement(By.xpath("//span[text()='Got it']"));
		gotit.click();
		WebElement button = driver.findElement(By.xpath("//input[@value='Reset']"));
		button.click();	
	}
}