package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Right click on elements and you can see html tags like 'Select'. It will have multiple options.
		//We have to use Select class in selenium 
//	WebElement element = driver.findElement(By.id(""));
//		//Here we have to create a cunstructor
//	Select select = new Select(element);
//		select.selectByVisibleText("");
//		select.selectByIndex(2);
//		select.selectByValue("");
driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");	

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
	
	
		doSelectByVisisbleText(industry, "Automotive");
		doSelectByVisisbleText(country, "India");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
public static void doSelectByVisisbleText(By locator, String text) {
	WebElement ele = getElement(locator);
	Select select = new Select(ele);
	select.selectByVisibleText(text);
}
}
