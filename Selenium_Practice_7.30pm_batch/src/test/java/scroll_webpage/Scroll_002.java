package scroll_webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.Base_Class;

public class Scroll_002 extends Base_Class {

	public static void main(String[] args) throws Throwable {
		Launch_Browser("Chrome");
		Navigate_Url("https://www.flipkart.com");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		// to scroll the page 
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		
		// click on carrers
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		TakesScreenshot("after clicking on careers");
		
		
		// CLICK ON HOME DECOR
	//	driver.findElement(By.xpath("//img[@alt='homeDecor'][2]")).click();
	//	TakesScreenshot("click on home decor");
		
		// to scroll page till down
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//	driver.findElement(By.xpath("//a[text()='Baby Pillows']")).click();
	//	TakesScreenshot("click on Pillows");
		
		Thread.sleep(4000);
		
		//to forward 
		js.executeScript("window.history.forward()");
		TakesScreenshot("click on forward");
		Thread.sleep(4000);
		
		// to backward 
		js.executeScript("window.history.back()");
		TakesScreenshot("click on backword");
		Thread.sleep(4000);
		
		// to refresh
		js.executeScript("window.history.go(0)");
		Thread.sleep(2000);
		
		
		

	}

}
