package org.seventh.day;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSch = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtSch.sendKeys("motorolo");
	    WebElement txtClk = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	    txtClk.click();
	    Thread.sleep(3000);
	    TakesScreenshot t=(TakesScreenshot)driver;
	    File s=t.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\screenshot\\pic8.png");
	    FileUtils.copyFile(s, d);
	    
        
       
	}
	

}
