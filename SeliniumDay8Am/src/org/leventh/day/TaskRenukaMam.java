package org.leventh.day;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.google.common.collect.LinkedHashMultimap;

public class TaskRenukaMam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone 7");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtclk = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		js.executeScript("arguments[0].click()", txtclk);
	//	List<WebElement> product = driver.findElements(By.tagName("img"));
	//	int size = product.size();
	//	System.out.println(size);
		WebElement productName = driver.findElement(By.xpath("//span[text()='Apple iPhone 8 (Gold, 256GB)']"));
	    System.out.println(productName.getText());
	    LinkedHashMap<String, String> mp=new LinkedHashMap<>();
	    List<WebElement> prdnames = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	    List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    for (int i = 0; i < prdnames.size(); i++) {
	    	WebElement txt = prdnames.get(i);
	    String name = txt.getText();
	    System.out.println(name);
	    	
			
		}
	    }

	
	

}
