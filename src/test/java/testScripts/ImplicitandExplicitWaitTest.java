package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicitWaitTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		
		/* Page Load Synchronization - setting at the driver level */
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		/* Implicit wait - setting at the driver level */
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://uitestingplayground.com");
		
		driver.findElement(By.xpath("//a[text()='Load Delay']")).click();

//		driver.navigate().to("https://www.google.com");
//		WebElement search = driver.findElement(By.id("APjFqb"));
//		search.sendKeys("Selenium Tutorial");
//		search.submit();
//		search.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);

//		List<WebElement> searchOption = driver
//				.findElements(By.xpath("//ul[@class='G43f7e'][1]//li//div[@class='wM6W7d']"));
//
//		System.out.println("Number of items..." + searchOption.size());
//		for (WebElement option : searchOption) {
//			System.out.println(option.getText());
//			if (option.getText().equalsIgnoreCase("selenium tutorial pdf")) {
//				option.click();
//				break;
//			}
//		}
		
		
//		driver.get("http://uitestingplayground.com/ajax");
//		
//		driver.findElement(By.id("ajaxButton")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Data loaded with AJAX get request.']")));
//		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
//		
//		System.out.println(driver.findElement(By.xpath("//p[text()='Data loaded with AJAX get request.']")).getText());
		
	}
}
