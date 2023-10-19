package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://automationbookstore.dev/");

		/*
		 * String str = driver
		 * .findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).
		 * below(By.id("pid1"))) .getAttribute("id");
		 * 
		 * String str1 = driver
		 * .findElement(RelativeLocator.with(By.tagName("li")).above(By.id("pid6")).
		 * toRightOf(By.id("pid1"))) .getAttribute("id");
		 * 
		 * System.out.println("IValue is... " + str); System.out.println("IValue is... "
		 * + str1);
		 */

//		driver.findElement(By.id("searchBar")).sendKeys("test");
//		Thread.sleep(2000);

		WebElement close = driver.findElement(By.xpath("//a[text()='Clear text']"));
		System.out.println(close.isDisplayed());
		if (close.isDisplayed()) {
			close.click();
		}
	}
}
