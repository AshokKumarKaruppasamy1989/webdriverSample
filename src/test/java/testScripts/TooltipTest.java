package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/tooltip/");

		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		WebElement age = driver.findElement(By.id("age"));

		age.sendKeys(Keys.PAGE_DOWN);
		action.moveToElement(age).perform();

		//String str = driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
		String str = driver.findElement(By.xpath("div.ui-tooltip-content")).getText();
		System.out.println(str);
	}
}
