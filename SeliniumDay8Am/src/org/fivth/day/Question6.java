package org.fivth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeliniumDay8Am\\\\drivers\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions a=new Actions(driver);
		WebElement txtCrs = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(txtCrs).perform();
		WebElement txtSch = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(txtSch).perform();
		driver.findElement(By.xpath("//span[text()='ISTQB Certification']")).click();
	}

}
