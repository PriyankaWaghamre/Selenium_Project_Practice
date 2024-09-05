package dynamic_code;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class Base_Class  {	
		public static WebDriver driver;
		public static String browser;
		
		// launch browser
		public static void Launch_Browser(String browser)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{ 
				driver= new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver= new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("Safari"))
			{
				driver= new SafariDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println("Launched Browser is: "+ browser);
		}
		
		// navigate URL
 public static void Navigate_Url(String URL)
 {
	 driver.get(URL);
	 System.out.println("Navigate Url is:- "+URL);
	 System.out.println("Navigate URL is:" +driver.getTitle());
	 System.out.println("Current URL is:" +driver.getCurrentUrl());
	 
 }
 
 // take screenshot
 
 public static void TakesScreenshot(String Screensshot_name) throws IOException 
 {
	org.openqa.selenium.TakesScreenshot ts =  (org.openqa.selenium.TakesScreenshot) driver;
	 File src= ts.getScreenshotAs(OutputType.FILE);
	 String projectpath = System.getProperty("user.dir");
	File target= new File(projectpath+"\\Evidences\\"+ Screensshot_name+".png");
	
	
	 // File target= new File("../Selenium_Practice_7.30pm_batch/Evidences"+ Screensshot_name+".png");
	//File target= new File("C:\\Users\\Priyanka\\eclipse-workspace\\Selenium_Practice_7.30pm_batch/Evidences"+Screenshot_name+".png");
	 
	 FileHandler.copy(src, target);
 }
 
 // Dynamic code for Scroll page
 
 public static void Scroll_Page(int a, int b)
 {
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1200)");
	
 }
 
 // 1. To enter text using action class
 public static void Action_Class(String s)
 {
 Actions act = new Actions(driver);
 WebElement search =  driver.findElement(By.xpath("//input[@class='Pke_EE']"));
 act.moveToElement(search).sendKeys("shoes");
 }
  
 //2. To select, copy and paste
 //3. Rightclick, doubleclick
 //4. Drag and drop
// 5. To move slider by certain offsets
 //6. Switch to frame
// 7. Back to window
// 8. To navigate backward, forward and refresh page
// 9. Scroll by offsets and scroll to bottom
// 10. Scroll using page down and page up key
 


}


