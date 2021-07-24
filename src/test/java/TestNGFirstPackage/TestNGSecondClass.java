package TestNGFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSecondClass {

	//pre-condition:
WebDriver driver;	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//to maximize the screen
        driver.manage().window().fullscreen();
		//to delete all cookies
		driver.manage().deleteAllCookies();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void amazonTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
		@Test
		public void amazonUrlTest() {
			
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("amazon"));
			
		}
		
		@Test
		public void mobileLinkPresentTest() {
			
		driver.findElement(By.linkText("Mobiles")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed());
		
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
