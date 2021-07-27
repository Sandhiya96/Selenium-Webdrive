package org.third.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement fstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fstName.sendKeys("sandhiya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']"))
		.sendKeys("k");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("No.5,Periyar nagar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sandhuajap@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9677029891");
		driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Karna@6782");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtPass.sendKeys("Karna@6782");
		
	


		
		
	}

}



