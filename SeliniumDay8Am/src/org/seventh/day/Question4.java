package org.seventh.day;

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

public class Question4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtPgdown = driver.findElement
				(By.xpath("//u[contains(text(),'Chennai')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",
				txtPgdown);
		Thread.sleep(3000);
		WebElement txtPrnt = driver.findElement(By.xpath("//u[contains(text(),'Chennai')]"));
		System.out.println(txtPrnt.getText());
		Thread.sleep(3000);
		TakesScreenshot t=(TakesScreenshot)driver;
		File s=t.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\screenshot\\pic2.png");
		FileUtils.copyFile(s, d);
	}

}
