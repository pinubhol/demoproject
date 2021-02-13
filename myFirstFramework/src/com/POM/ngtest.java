package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ngtest {
	
	@Test
	public static void loginz() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		loginEX lm=new loginEX(driver);
		lm.un();
		lm.pw();
		lm.lg();
		Thread.sleep(2000);
		mainpageEx mn=new mainpageEx(driver);
		mn.ser("nokia");
		mn.enter();
		Thread.sleep(5000);
		driver.quit();
				
		
	}

}
