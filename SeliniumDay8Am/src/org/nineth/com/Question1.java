package org.nineth.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement txtState = driver.findElement(By.xpath("//div[text()='Select State']"));
		Select s=new Select(txtState);
		List<WebElement> allOptions = s.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		for (int i = 0; i <allOptions.size() ; i++) {
			if (i%2==0) {
				WebElement eachOption = allOptions.get(i);
				System.out.println(eachOption.getText());
				
			}
			
		}
		
		
	
		
	}

}
