package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement txtLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		txtLogin.click();
		Thread.sleep(3000);
		WebElement txtName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtName.sendKeys("Amirtha");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("1234567");
	}

}
