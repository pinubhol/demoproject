package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Biswaranjan/Downloads/select.html");
		
		/*WebElement s= driver.findElement(By.xpath("//select[@id='a1']"));
        Select sel=new Select(s);
        //sel.selectByIndex(1);
        //sel.selectByValue("v");
        sel.selectByVisibleText("chutney");*/
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='a2']"));
		Select sel2=new Select(ele2);
		sel2.selectByIndex(2);
		sel2.selectByVisibleText("poori");
		sel2.selectByValue("a");
		
        Thread.sleep(3000);
        sel2.deselectAll();
        driver.quit();
	}

}
