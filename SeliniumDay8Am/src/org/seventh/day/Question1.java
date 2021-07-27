package org.seventh.day;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/\r\n" +"");
		Thread.sleep(3000);
		TakesScreenshot t=(TakesScreenshot)driver;
	    File s = t.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\screenshot\\pic1.png");
	    FileUtils.copyFile(s,d);
	}

}
