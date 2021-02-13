package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firstlearn {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		/*Thread.sleep(3000);
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys("Biswaranjan");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		System.out.println("hello");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);*/
		Actions action=new Actions(driver);
		WebElement dra=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dro= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Thread.sleep(5000);
		action.dragAndDrop(dra,dro).perform();
		Thread.sleep(3000);
		
		
         driver.quit();  
         
	}

}
