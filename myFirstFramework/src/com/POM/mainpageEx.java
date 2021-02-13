package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpageEx {
	
	//declaration
  @FindBy(xpath="//input[@class='_3704LK']")
  private WebElement search;
  @FindBy(xpath="//button[@class='L0Z3Pu']")
  private WebElement ser_button;
  //initialization
  public mainpageEx (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public void ser(String data) {
	  search.sendKeys(data);
  }
  public void enter() {
	  ser_button.click();
  }
}
