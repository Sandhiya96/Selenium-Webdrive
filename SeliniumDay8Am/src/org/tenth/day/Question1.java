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


public class Question1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/\r\n");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone x");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		WebElement txtPic = driver.findElement(By.xpath("//img[@alt='iPhone XR']"));
		Actions a=new Actions(driver);
		a.contextClick(txtPic).perform();
		Robot r=new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parentId = driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();
		for (String eachWinId : childId) {
			if (!eachWinId.equals(parentId)) {
				driver.switchTo().window(eachWinId);	
			}
			
		}
		WebElement txtPrice = driver.findElement(By.xpath("(//span[contains(text(),'account')])[1]"));
	    System.out.println(txtPrice.getText());
		
	}
	

}
