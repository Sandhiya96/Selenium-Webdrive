package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("kurthy");
		WebElement txtClk = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		txtClk.click();
		
	}

}
