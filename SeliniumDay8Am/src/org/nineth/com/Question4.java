package org.nineth.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement txtMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(txtMonth);
		if (s.isMultiple()) {
			System.out.println("more than one  option ");
			
		}
		else {
			System.out.println("only one option");
		}
		
		Thread.sleep(3000);
		s.selectByValue("5");
		List<WebElement> allOptions = s.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement eachOption = allOptions.get(i);
			System.out.println(eachOption.getText());
		}
		
		
	}

}
