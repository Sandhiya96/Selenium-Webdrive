package org.tenth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement txtCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(txtCourse).perform();
		driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
		WebElement txtCur = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		a.contextClick(txtCur).perform();
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Alert a2=driver.switchTo().alert();
		a2.accept();
		

	}
     

}
