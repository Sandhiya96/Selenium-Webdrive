package org.excersise;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			
			WebElement row = allRows.get(i);
			Thread.sleep(3000);
		   List<WebElement> allData = row.findElements(By.tagName("td"));
		  
		    for (int j = 0; j <allData.size(); j++) {
		    	
		    	WebElement data = allData.get(j);
		    	String name = data.getText();
		    	if (name.equals("Mexico")) {
					System.out.println(name);
					System.out.println(i);
					System.out.println(j);
				} 

				}
			}
			
		}
			

			
		
		
	

}
