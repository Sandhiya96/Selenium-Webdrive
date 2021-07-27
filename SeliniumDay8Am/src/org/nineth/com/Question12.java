package org.nineth.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s=new Select(fruits);
		if (s.isMultiple()) {
			System.out.println("more than options can be selected");
			
		} else {
			System.out.println("only one option");

		}
		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Grape");
		
	}

}
