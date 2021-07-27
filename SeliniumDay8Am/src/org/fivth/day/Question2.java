package org.fivth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement txtPrime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions a=new Actions(driver);
		a.moveToElement(txtPrime).perform();
		Thread.sleep(3000);
		WebElement txtSch = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		a.moveToElement(txtSch).perform();
		txtSch.click();
		
		
	}

}
