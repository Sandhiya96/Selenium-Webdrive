package org.eight.day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[contains(text(),'Alert ')])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		
	}

}
