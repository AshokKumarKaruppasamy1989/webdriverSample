package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAxesMethods {
	
	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
	}
}
