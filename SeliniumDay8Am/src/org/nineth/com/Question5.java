package org.nineth.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement txtYear = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(txtYear);
		List<WebElement> alloptions = s.getOptions();
		for (WebElement eachOptions : alloptions) {
		
		   System.out.println(eachOptions.getText());
			
		}
		
	}
	}


