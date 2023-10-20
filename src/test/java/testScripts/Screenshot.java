package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File img = screen.getScreenshotAs(OutputType.FILE);
		
		try {
		
		FileUtils.copyFile(img, new File(System.getProperty("user.dir")
				+ "//screenshots//"
				+"FullScreen.PNG"
				));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		WebElement eleImg = driver.findElement(By.cssSelector("div#logo"));
		File imgElement = eleImg.getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(imgElement, new File(System.getProperty("user.dir")
					+ "//screenshots//"
					+"ElementScreen.PNG"
					));
			
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
