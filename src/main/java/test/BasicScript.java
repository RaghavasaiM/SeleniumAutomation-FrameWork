package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	 public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		String title = driver.getTitle();
		
		System.out.println("Title  is:"+title);
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.className("btn")).click();
		
//		driver.close();
//		driver.quit();
	}
}
