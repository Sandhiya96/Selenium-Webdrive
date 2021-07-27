package org.sel.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Sandhiya\\eclipse-workspace\\SeliniumDay8Am\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String titleName=driver.getTitle();
		System.out.println("TitleName is:"+titleName);
		String url=driver.getCurrentUrl();
		System.out.println("url is:"+url);
	
	}

}
