package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationEx {
	static WebDriver  driver;
	@BeforeSuite
	public static void loginflip() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		loginEX lm=new loginEX(driver);
		lm.un();
		lm.pw();
		lm.lg();
		Thread.sleep(5000);
	}
	@Test
	public static void searchmob() throws InterruptedException {
		mainpageEx mn=new mainpageEx(driver);
		mn.ser("mobile");
		mn.enter();
		Thread.sleep(3000);
	}
	    @Test
		public static void searchmobile() throws InterruptedException {
			mainpageEx mn=new mainpageEx(driver);
			mn.ser("nokia");
			mn.enter();
			Thread.sleep(3000);	
	}
	@AfterSuite
    public static void logout() {
    	driver.quit();
    }
}
