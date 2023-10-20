package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println(parentWin);
		driver.findElement(By.xpath("//button[text()=' Click to open new Tab ']")).click();
		
		Set<String> mulWindow = driver.getWindowHandles();
		System.out.println(mulWindow.size());
		for(String tab: mulWindow) {
			if(!tab.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(tab);
				driver.findElement(By.xpath("(//span[text()='Java'])[1]")).click();
			}
		}
		
		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[text()=' Click to open new Window ']")).click();
//		driver.quit();
		
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
	}
}
