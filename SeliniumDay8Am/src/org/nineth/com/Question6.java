package org.nineth.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(country);
		s.selectByVisibleText("ARGENTINA");
		List<WebElement> allOptions = s.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement eachOptions = allOptions.get(i);
			System.out.println(eachOptions.getText());
			
		}
	}

}
