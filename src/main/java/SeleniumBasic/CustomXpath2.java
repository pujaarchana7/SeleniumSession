package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath2 {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		////a[text()='Aanuj D']//parent::td//preceding-sibling::td/input[@type ="checkbox"]

		 ////span[text()='malavika vinod']//ancestor::td//preceding-sibling::td//input//parent::span

	//String xpathMalu = "//span[text()='malavika vinod']//ancestor::td//preceding-sibling::td/child::div";
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 //driver.get("https://classic.crmpro.com/");
	driver.get("https://app.hubspot.com/login");
 Thread.sleep(6000);
 driver.findElement(By.id("username")).sendKeys("pujaarchana9@gmail.com");
 driver.findElement(By.id("password")).sendKeys("Pamv#107");
 driver.findElement(By.id("loginBtn")).click();
 
 Thread.sleep(6000);
 driver.navigate().to("https://app.hubspot.com/contacts/8772251/contacts/list/view/all/");
 Thread.sleep(4000);

 
 selectContact("malavika vinod");
 selectContact("Rama Pandey");
 
 System.out.println(getContactEmail("malavika vinod"));
 
 System.out.println(getContactEmail("Rama Pandey"));
	}
	public static void selectContact(String name) {
		String xpathMalu = "//span[text()= '"+ name + "']//ancestor::td//preceding-sibling::td/child::div";
		driver .findElement(By.xpath(xpathMalu)).click();
	}
	public static String getContactEmail(String name) {
		return driver.findElement(By.xpath("//span[text()='" +name+"']//ancestor::td//following-sibling::td/a")).getText();
		
	}

}


////span[text()='malavika vinod']//ancestor::td//preceding-sibling::td/child::div