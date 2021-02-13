package learnautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	  File sc= ts.getScreenshotAs(OutputType.FILE);
	  File dst= new File("D:\\Java and Selenium\\home.jpg");
	  FileUtils.copyFile(sc,dst);
	  driver.quit(); 
		
		

	}

}
