package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaAccountTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register");
		
		driver.findElement(By.xpath("//button[contains(text(), 'SIGN UP')]")).click();

	}

}
