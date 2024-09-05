package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Basics {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// to get the URL
		driver.get("https://www.myntra.com");
		
		//System.out.println(driver.getPageSource());
		
		// print the title of the page
		System.out.println(driver.getTitle());
		
		// to print the co-ordinates of the page
		System.out.println(driver.getWindowHandle());
		
		// to print current URl
		System.out.println(driver.getCurrentUrl());
		


	}

}
