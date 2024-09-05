package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screensshot_001 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target= new File("../Selenium_Practice_7.30pm_batch/Evidences/fbook_homepage.png");
		FileHandler.copy(src, target);
		
		TakesScreenshot ts1= (TakesScreenshot) driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("/Selenium_Practice_7.30pm_batch/Evidences/login.png");
		FileHandler.copy(src1, target1);
		

	}

}
