package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Java Tutorial");
		search.sendKeys(Keys.ENTER);
		
		System.out.println("Page Title - " + driver.getTitle());
//		System.out.println("Page Current URL - " + driver.getCurrentUrl());
		
		driver.navigate().back();

	}
}
