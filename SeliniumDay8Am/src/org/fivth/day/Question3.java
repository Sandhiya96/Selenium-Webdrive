package org.fivth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	    WebElement txtHome = driver.findElement(By.xpath("//div[text()='Home']"));
	    a.moveToElement(txtHome).perform();
	    driver.findElement(By.xpath("(//a[text()='Home Cleaning & Bathroom Accessories'])[1]")).click();
	    
	    
		
	}

}
