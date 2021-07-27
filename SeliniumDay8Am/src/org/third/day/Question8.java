package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement txtModelResume = driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[14]"));
		txtModelResume.click();
		WebElement txtModel = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		txtModel.click();
	}
	

}
