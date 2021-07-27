package org.sixth.day;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Question7 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeliniumDay8Am\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html#");
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//div[@id='heading303']")).click();
		WebElement txtDay6 = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
		a.contextClick(txtDay6).perform();
		Robot r=new Robot();
		for (int i = 0; i < 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
