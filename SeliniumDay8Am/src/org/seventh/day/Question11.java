package org.seventh.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question11 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtFshn = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		a.moveToElement(txtFshn).perform();
	
		
		
		
		
	}

}
