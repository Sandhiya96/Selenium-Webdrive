package org.seventh.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/\r\n" + "\r\n" + "");
       JavascriptExecutor js=(JavascriptExecutor)driver;
       WebElement txtSch = driver.findElement(By.xpath("//input[@type='text']"));
       txtSch.sendKeys("iphone");
       Robot r=new Robot();
       WebElement txtclk = driver.findElement(By.xpath("//button[@type='submit']"));
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(3000);
       TakesScreenshot t=(TakesScreenshot)driver;
       File s=t.getScreenshotAs(OutputType.FILE);
       File d=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\screenshot\\pic7.png");
       FileUtils.copyFile(s, d);
       
       
       
       
       
		
	}

}
