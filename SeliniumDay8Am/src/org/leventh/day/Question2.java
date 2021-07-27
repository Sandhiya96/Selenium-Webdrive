package org.leventh.day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement data = driver.findElement(By.xpath("//td[text()='first cell']"));
		List<WebElement> allrows = data.findElements(By.tagName("tbody"));
		for (int i = 0; i < allrows.size(); i++) {
			WebElement allData = allrows.get(i);
			System.out.println(allData.getText());
		}

	}

}
