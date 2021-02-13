package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstlearn {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys("Biswaranjan");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		System.out.println("hello");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
         driver.quit();  
	}

}
