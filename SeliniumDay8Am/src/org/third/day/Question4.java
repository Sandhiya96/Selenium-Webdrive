package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement fstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fstName.sendKeys("Anusuya");
		driver.findElement
		(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kanniyappan");
		driver.findElement
		(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("anusyya98@gmail.com");
		driver.findElement
	
		(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9176232873");
		
		
	


	}
}
