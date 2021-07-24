package SeleniumBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 //driver.get("https://classic.crmpro.com/");
driver.get("https://www.espncricinfo.com/series/8048/scorecard/1237180/delhi-capitals-vs-sunrisers-hyderabad-qualifier-2-indian-premier-league-2020-21");

System.out.println(getWicketTakerName("MP Stoinis"));
//System.out.println(getBatsmanScore("MP Stoinis"));
//System.out.println(getWicketTakerName("S Dhawan"));
//System.out.println(getBatsmanScore("S Dhawan"));
System.out.println(getPlayerDetailScore("S Dhawan"));
	}
public static String getWicketTakerName(String name) {
String wicketTakerName = driver.findElement(By.xpath("//a[text() = '" +name+ "']//parent::td//following-sibling::td/span/span")).getText();
	return wicketTakerName;
}
public static String getBatsmanScore(String name) {
	String playerScore = driver.findElement(By.xpath("//a[text() = '" +name+ "']//parent::td//following-sibling::td//following-sibling::td[@class='font-weight-bold']")).getText();
	return playerScore;
}
public static List<String> getPlayerDetailScore(String name) {
	System.out.println("score card for : " + name);
	List<String> scoreCardList = new ArrayList<String>();
	List<WebElement> scoreList = driver.findElements(By.xpath("//a[text() = '"+name+"']//parent::td//following-sibling::td"));
	
	for(int i=1; i<scoreList.size(); i++) {
		String scoreText = scoreList.get(i).getText();
		System.out.println(scoreText);
	}
	return scoreCardList;
	}
	
}

////a[text() = 'MP Stoinis']//parent::td//following-sibling::td//following-sibling::td
////a[text() = 'MP Stoinis']//parent::td//following-sibling::td//following-sibling::td[@class="font-weight-bold"]