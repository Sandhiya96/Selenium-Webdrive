package org.tenth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txtSch = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txtSch.sendKeys("iphones 7");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		 driver.findElement(By.xpath
				("//p[text()='Apple iPhone 7 Shock Proof Case Vikefon - Black Frameless Back Cover']")).click();
		String parWinId = driver.getWindowHandle();
		Set<String> childWind = driver.getWindowHandles();
		for (String eachId : childWind) {
			if (!eachId.equals(parWinId)) {
				driver.switchTo().window(eachId);

			}
			
			
			driver.findElement(By.xpath("//span[text()='add to cart']")).click();
			Thread.sleep(3000);
			
			 WebElement txtPrice = driver.findElement(By.xpath("//span[@class='pdp-final-price']"));
			 System.out.println(txtPrice.getText());

		}

	}

}
