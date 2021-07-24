package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
static WebDriver driver;
	public static void main(String[] args) {
		String browser = "chrome";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}

	else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else {
		System.out.println("Pass the correct browser");
	}
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
driver.quit();
}
}