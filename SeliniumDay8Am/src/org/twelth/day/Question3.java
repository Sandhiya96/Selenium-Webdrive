package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtPgdwn = driver.findElement(By.xpath("//div[@id='heading304']"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtPgdwn);
	}

}
