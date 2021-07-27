package org.fivth.day;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(course).perform();
	    WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(oracle).perform();
		WebElement certificate = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
		certificate.click();
	}
	

}
