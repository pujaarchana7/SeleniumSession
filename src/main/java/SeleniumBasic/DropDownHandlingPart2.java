package SeleniumBasic;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingPart2 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		 doGetDropdownOptions(industry);
		
//		WebElement ele = driver.findElement(country);
//		Select select = new Select(ele);
////		select.selectByVisibleText("India");
//    List<WebElement> getOptionslistIndustry = select.getOptions();
//System.out.println(getOptionslistIndustry.size());
//
//for(int i=0; i<getOptionslistIndustry.size(); i++) {
//	String text = getOptionslistIndustry.get(i).getText();
//	System.out.println(text);
//}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
public static List<String> doGetDropdownOptions(By locator) {
List<String> optionsValueList = new ArrayList<String>();
	Select selectList = new Select (getElement(locator));
	List<WebElement> getOptionslist = selectList.getOptions();
	
//	for(WebElement e: getOptionslist) {
//		optionsValueList.add(e.getText());
//	}
	for(int i =0; i<getOptionslist.size(); i++) {
		String text = getOptionslist.get(i).getText();
		System.out.println(text);
	}
	return optionsValueList;
	
}
}
