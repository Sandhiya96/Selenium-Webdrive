package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		WebElement src = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement des = driver.findElement(By.id("mydropzone"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
		
		
		
	}
	

}
