package org.fivth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quetion4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions a=new Actions(driver);
		WebElement txtSrc = driver.findElement
				(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(txtSrc).perform();
		Thread.sleep(3000);
		WebElement txtSam = driver.findElement
				(By.xpath("(//a[text()='Samsung'])[1]"));
		a.moveToElement(txtSam).perform();
		txtSam.click();
	
		
		
	}

}
