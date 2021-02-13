package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginEX {

	
	//declaration
	  @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	  private WebElement username;
	  @FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	  private WebElement password;
	  @FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	  private WebElement log;
	  @FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")
	  private WebElement otp;
	  
	  //initialization
	  public loginEX (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void un() {
		  username.sendKeys("pinubhol@gmail.com");
	  }
	  public void pw() {
		  password.sendKeys("pinu@1991");
	  }
	  public void lg() {
		  log.click();
	  }

}
