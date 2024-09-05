package action_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_Class;

public class Action_Class_001 extends Base_Class
{
	public static void main(String[] args) throws Throwable {
		Launch_Browser("chrome");
		Navigate_Url("https://jqueryui.com/droppable/");
		TakesScreenshot("launched browser");
		Actions act = new Actions(driver);
		
		//llocate frame
		WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		//Thread.sleep(3000);
		WebElement drop=  driver.findElement(By.cssSelector("div#droppable"));
		
	act.dragAndDrop(drag, drop).build().perform();
		
	
	WebElement search = driver.findElement(By.xpath("//input[@type=\"search\"]"));
	act.moveToElement(search).contextClick().build().perform();
	act.sendKeys(search, "mobiles");
	//act.contextClick(search);
	
	//WebElement text= driver.findElement(By.xpath("//a[text()='API Documentation']"));
	//act.moveToElement(text).contextClick().build().perform();
	//act.sendKeys(text, args)
		
	}

}
