package org.tenth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewSanitizer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txtSch = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		txtSch.sendKeys("neusafe hand sanitizer spray");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement sanitizer = driver.findElement(By.xpath("//p[text()='Dr Rhazes alcohol based Hand Sanitizer 500 mL Pack of 2']"));
		js.executeScript("arguments[0].click()", sanitizer);
		String parId = driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();

		for (String eachWinId : childId) {
			if (!eachWinId.equals(parId)) {
				driver.switchTo().window(eachWinId);
			}
		}
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		js.executeScript("arguments[0].click()", addToCart);
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-final-price']"));
		System.out.println(price.getText());
	}
}