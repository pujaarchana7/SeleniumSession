package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
 WebDriver driver;
 
 public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

public  WebElement getElement(By locator) {
	return driver.findElement(locator);
}

public  String getText(By locator) {
	return getElement(locator).getText();
}

public  boolean doDisplayed(By locator) {
return getElement(locator).isDisplayed();
}

public  void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}
public  void doClick(By locator) {
	getElement(locator).click();
}
}
