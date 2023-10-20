package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// main page
//		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
//		String label = driver.findElement(By.xpath("//label/span")).getText();
//		System.out.println(label);

		// from main page to frame1
//		driver.switchTo().frame("frame1");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome!");

		// from frame 1 to frame 3
//		driver.switchTo().frame("frame3");
//		driver.findElement(By.id("a")).click();

		// from frame 3 to frame 1
//		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath("//input[@type='text']")).clear();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Again!");

		// from frame 1 to main page
//		driver.switchTo().defaultContent();
//		String label1 = driver.findElement(By.xpath("//label/span")).getText();
//		System.out.println(label1);
//		
		// from main page to frame 2
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("frame2");
//		Select sel = new Select(driver.findElement(By.id("animals")));
//		sel.selectByVisibleText("Big Baby Cat");

		// from main page to frame2
//		driver.switchTo().frame(1);
//		Select sel = new Select(driver.findElement(By.id("animals")));
//		sel.selectByVisibleText("Big Baby Cat");

		driver.get("https://the-internet.herokuapp.com/iframe");

		// from main page to frame1
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='mce-content-body ']/p")).clear();
		driver.findElement(By.xpath("//body[@class='mce-content-body ']/p")).sendKeys("Hello Welcome!");

		// from frame 1 to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Powered by Tiny']")).click();

	}
}
