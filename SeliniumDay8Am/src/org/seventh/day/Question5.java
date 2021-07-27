package org.seventh.day;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtPgdown = driver.findElement(By.xpath("//div[text()='Join our Demo Classes']"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtPgdown);
		Thread.sleep(3000);
		TakesScreenshot t=(TakesScreenshot)driver;
		File s=t.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\screenshot\\pic3.png");
		FileUtils.copyFile(s, d);
	    Thread.sleep(3000);
		WebElement txtPgtop = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)", txtPgtop);
		
	}

}
