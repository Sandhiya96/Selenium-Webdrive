package org.twelth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtPagdwn = driver.findElement(By.xpath("//div[text()='Share this page']"));
		js.executeScript("arguments[0].scrollIntoView(true)", txtPagdwn);
		WebElement txtPgtop = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(false)",txtPgtop );
	}

}
