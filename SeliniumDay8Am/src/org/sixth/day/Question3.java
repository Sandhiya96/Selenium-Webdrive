package org.sixth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) throws AWTException {
	        System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			Actions a=new Actions(driver);
			WebElement txtInt = driver.findElement(By.xpath("//div[@id='heading20']"));
			txtInt.click();
			WebElement txtTcs = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
			a.contextClick(txtTcs).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
	
	}

}
