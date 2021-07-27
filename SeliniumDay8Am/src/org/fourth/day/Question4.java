package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement txtSearch=driver.findElement
				(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
		System.out.println(txtSearch.getText());
		
	}

}
