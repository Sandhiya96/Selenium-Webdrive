package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	 driver.findElement(By.xpath("(//span[@class='text'])[4]")).click();
	 Thread.sleep(3000);
	 WebElement txtPara = driver.findElement(By.xpath("//p[@class='justify']"));
	 System.out.println(txtPara.getText());
		

	}

}
