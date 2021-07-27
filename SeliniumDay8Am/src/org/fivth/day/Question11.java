package org.fivth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		WebElement dept = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a=new Actions(driver);
		a.moveToElement(dept).perform();
		
		
		Thread.sleep(5000);
		WebElement heat = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		a.moveToElement(heat).perform();
		
	}

}
