package drop_down;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_Class;

public class Static_dropdown extends Base_Class {

	public static void main(String[] args) throws Throwable {
		
		Launch_Browser("chrome");
		Navigate_Url("https://www.jeevansathi.com/");
		TakesScreenshot("static dropdown");
	
	//	WebElement profile=driver.findElement(By.xpath("//p[text()='Create Profile For']"));
	//	profile.click();
		
		driver.findElement(By.cssSelector("p#relationship")).click();
		driver.findElement(By.cssSelector("div#relationshipOptions")).click();
		
		
		
		 
	}

}
