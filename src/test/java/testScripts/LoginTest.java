package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@type='password' or id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	}

}
