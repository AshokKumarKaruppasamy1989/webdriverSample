package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.google.com");

		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Selenium Tutorial");
		search.submit();
//		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		/*
		 * List<WebElement> searchOption = driver
		 * .findElements(By.xpath("//ul[@class='G43f7e'][1]//li//div[@class='wM6W7d']"))
		 * ;
		 * 
		 * System.out.println("Number of items..." + searchOption.size()); for
		 * (WebElement option : searchOption) { System.out.println(option.getText()); if
		 * (option.getText().equalsIgnoreCase("selenium tutorial pdf")) {
		 * option.click(); break; } }
		 */

//		System.out.println("Page Title - " + driver.getTitle());
//		System.out.println("Page Current URL - " + driver.getCurrentUrl());

//		driver.navigate().back();

	}
}
