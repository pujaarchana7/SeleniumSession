package TestNGFirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	
	@Test
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
		@Test
		public void googleUrlTest() {
			driver.get("https://www.google.com");
			
			String url = driver.getCurrentUrl();
			Assert.assertTrue(url.contains("google"));
			
		}
		

}
