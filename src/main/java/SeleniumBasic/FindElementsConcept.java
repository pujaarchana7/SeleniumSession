package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		//all links -- a tag
		//all images -- img tag
		// multiple text fields-- input tag
		//multiple buttons -- button
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//Get the total number of links on the page:
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("total number of links " + linkList.size());
		
		//get the text of each link'
		
		for(int i=0; i<linkList.size(); i++) {
			String text = linkList.get(i).getText();

//remove the empty link

		if(! text.isEmpty()) {
			System.out.println(i + "-->" + text);
		}
	}
		

}
}