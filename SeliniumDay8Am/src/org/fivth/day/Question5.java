package org.fivth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\SeliniumDay8Am\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Actions a=new Actions(driver);
		WebElement txtSpt = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(txtSpt).perform();
		WebElement txtDiet = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		txtDiet.click();
	}

}
