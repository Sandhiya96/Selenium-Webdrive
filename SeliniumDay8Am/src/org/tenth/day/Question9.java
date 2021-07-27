package org.tenth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','redmiPhone')", search);
		
	}

}
