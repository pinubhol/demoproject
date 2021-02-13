package learnautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.POM.loginEX;
import com.POM.mainpageEx;

public class pomSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		loginEX l= new loginEX(driver);
		l.un();
		l.pw();
		l.lg();
		
		Thread.sleep(5000);
	    mainpageEx p=new mainpageEx(driver);
	    p.ser("huwai");
	    p.enter();
	    Thread.sleep(2000);
	    driver.quit();
	}
}
