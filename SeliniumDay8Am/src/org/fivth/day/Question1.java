package org.fivth.day;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html \r\n" + "\r\n" + "");
		Actions a=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(src, des).perform();
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(src1, des1).perform();
		
		}

}
