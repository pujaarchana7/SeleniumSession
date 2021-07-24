package TestNGFirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest{
//Rediff.com: News | Rediffmail | Stock Quotes | Shopping
	
	@Test
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}
		@Test
		public void rediffUrlTest() {
			driver.get("https://www.rediff.com");
          String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("rediff"));
			
		}
}
