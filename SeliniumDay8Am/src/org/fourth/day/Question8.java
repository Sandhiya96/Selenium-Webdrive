package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		txtUser.sendKeys("sandhiya");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys("karna@6782");
		String u1 = txtUser.getAttribute("value");
		System.out.println(u1);
		String p1 = txtPass.getAttribute("value");
		System.out.println(p1);
		
	}

}
