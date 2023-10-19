package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadioBtnTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

//		WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
//		if (!checkbox.isSelected()) {
//			checkbox.click();
//		}

		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

		WebElement radio = driver.findElement(By.xpath("//input[@value='5 - 15']"));

		if (!radio.isSelected()) {
			radio.click();
		}
	}
}
