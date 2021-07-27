package org.tenth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(".ingreenstech/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement selinium = driver.findElement(By.xpath("//div[@id='heading303']"));
		selinium.click();
		driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']")).click();
		
		
		
	}

}
