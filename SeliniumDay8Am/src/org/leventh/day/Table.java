package org.leventh.day;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> headings = row.findElements(By.tagName("th"));
		for (int j = 0; j < headings.size(); j++) {
				WebElement eachHeading = headings.get(j);
				String text = eachHeading.getText();
				System.out.println(text);
				
			}
			List<WebElement> data = row.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement eachData = data.get(i);
		       String text1 = eachData.getText();
		       System.out.println(text1);
			}
		}
		
		
	}

}
