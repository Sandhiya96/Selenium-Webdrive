package org.sixth.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question9 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		WebElement txtSign = driver.findElement
				(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		txtSign.click();
		WebElement txtName = driver.findElement
				(By.xpath("//input[@name='email']"));
		txtName.sendKeys("sandhuajap");
		a.doubleClick().perform();
		a.contextClick(txtName).perform();
		Robot r=new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
