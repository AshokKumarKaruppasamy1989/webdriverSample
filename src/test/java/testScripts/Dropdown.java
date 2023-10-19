package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select sinsel = new Select(driver.findElement(By.id("select-demo")));
		sinsel.selectByVisibleText("Tuesday");
		
		Select mulsel = new Select(driver.findElement(By.id("multi-select")));
		mulsel.selectByVisibleText("Pennsylvania");
		mulsel.selectByIndex(1);
		mulsel.selectByValue("New York");

	}
}
