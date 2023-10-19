package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.opencart.com/");

		Actions action = new Actions(driver);
		/*
		 * WebElement searchbox = driver.findElement(By.name("search")); //
		 * action.contextClick(searchbox).perform();
		 * 
		 * WebElement menu = driver.findElement(By.xpath("//a[text()='Components']"));
		 * // action.moveToElement(menu).perform();
		 * 
		 * WebElement submenu =
		 * driver.findElement(By.xpath("//a[text()='Monitors (2)']")); //
		 * action.click(submenu).perform();
		 * 
		 * action.moveToElement(menu).click(submenu).build().perform(); //
		 * action.scrollByAmount(10, 400).perform();
		 * action.scrollToElement(driver.findElement(By.
		 * xpath("//a[text()='Samsung SyncMaster 941BW']"))).perform();
		 */

		driver.get("https://stqatools.com/demo/DoubleClick.php");
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		action.doubleClick(doubleClick).perform();
	}
}
