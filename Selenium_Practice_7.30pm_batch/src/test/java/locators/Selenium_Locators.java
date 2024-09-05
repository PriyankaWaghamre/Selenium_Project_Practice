package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		// xpath 
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com").click();
		// username field
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abc@gmail.com");
		email.click();
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("abc@123");
		pass.click();
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
				
		
		
	}

}
