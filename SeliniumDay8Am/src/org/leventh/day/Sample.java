package org.leventh.day;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("neusafe sanitizer");
	    driver.findElement(By.xpath("//span[text()='Search']")).click();
	    driver.findElement(By.xpath("//p[@title='Dr Rhazes alcohol based Hand Sanitizer 500 mL Pack of 2']")).click();
	    String parId = driver.getWindowHandle();
	    Set<String> childId = driver.getWindowHandles();
	    for (String eachWinId : childId) {
			if (!eachWinId.equals(parId)) {
				driver.switchTo().window(eachWinId);
			}
		}
	    driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}
	

}
