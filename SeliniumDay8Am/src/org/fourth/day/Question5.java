package org.fourth.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement txtPara = driver.findElement
				(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		System.out.println(txtPara.getText());
		WebElement txtPara1 = driver.findElement
				(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
	    System.out.println(txtPara1.getText());
	    WebElement txtPara2 = driver.findElement
	    		(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[3]"));
	    System.out.println(txtPara2.getText());
	    
	}

}
