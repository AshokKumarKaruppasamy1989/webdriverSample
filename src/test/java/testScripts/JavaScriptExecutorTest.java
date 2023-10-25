package testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String str = (String) jse.executeScript("return document.title");
		System.out.println(str);
		
		WebElement input = (WebElement) jse.executeScript("return document.getElementsByName('search')[0]");
		input.sendKeys("samsung");
		
		jse.executeScript("window.scrollBy(10,document.body.scrollHeight)");

	}
}
