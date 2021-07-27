package org.seventh.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtPagedown = driver.findElement
				(By.xpath("//span[text()='Recent Articles']"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtPagedown);
	}
	

}
