package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class DifferentLocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();

		//driver.get("https://classic.crmpro.com/");
		//Thread.sleep(6000);
		//driver.get("https://www.freshworks.com/");
      
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		//2. By name
//		driver.findElement(By.name("username")).sendKeys("testPuja");
//		driver.findElement(By.name("password")).sendKeys("test@123");
		
	//3. className : not unique
	//	driver.findElement(By.className("form-control")).sendKeys("testMalu");
		
		//4. xpath : is not an attribute. Its a locator (address of the element in DOM):
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("testMalu");
		
		//5. css selector
	
		//driver.findElement(By.cssSelector("#username")).sendKeys("testMalu");
		
		//6. linkText 
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7. partialLinkText: Only for links:
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//We should prefer link text more 
		
		//8. Tag Name
		
//		String h2_text= driver.findElement(By.tagName("h2")).getText();
//		System.out.println(h2_text);
  
		//Capture the text of that particular link
//		
//		String text = driver.findElement(By.linkText("Sign up")).getText();
//		System.out.println(text);
		By signup_text = By.linkText("Sign up");
		
//		String text = getText(signup_text);
//		System.out.println(text);
		
		By emailId= By.id("username");
		if (doDisplayed(emailId)) {
			System.out.println("email id is present");
			doSendKeys(emailId, "test@gmail");
		}
		
		if (doDisplayed(signup_text)) {
			System.out.println("sign up link is present");
			doClick(signup_text);
		}
		
	//element is there or not	
//		boolean b = driver.findElement(By.id("username")).isDisplayed();
//		if (b = true) {
//			System.out.println("element is present");
//		}
//			else {
//				System.out.println("element is not present");	
//			}
		
		
		}
		
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getText(By locator) {
		return getElement(locator).getText();
	}
	
	public static boolean doDisplayed(By locator) {
	return getElement(locator).isDisplayed();
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
}


