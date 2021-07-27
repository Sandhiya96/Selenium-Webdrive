package org.sixth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
	public static void main(String[] args) throws AWTException {
	     System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html\r\n" + "");
	Actions a=new Actions(driver);
	Robot r=new Robot();
	WebElement txtFrm = driver.findElement
			(By.xpath("//div[@id='heading304']"));
	a.contextClick(txtFrm).perform();
    r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_UP);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	

	
	}

}
