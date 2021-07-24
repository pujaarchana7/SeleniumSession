package TestNGFirstPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestWithAM extends BaseTest{

	@Test
	public void amazonTitleTest() {
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
		@Test
		public void amazonUrlTest() {
			driver.get("https://www.amazon.in");
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("amazon"));
	}
		
		@Test
		public void mobileLinkPresentTest() {
			driver.get("https://www.amazon.in");	
		driver.findElement(By.linkText("Mobiles")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed());
		
	}

}
