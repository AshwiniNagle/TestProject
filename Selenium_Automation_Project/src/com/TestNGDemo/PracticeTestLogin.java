package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeTestLogin {
WebDriver driver;

public PracticeTestLogin(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id = "username")
WebElement Username;
public void setUserName(String un) {
Username.sendKeys(un);
}
@FindBy(id = "password")
WebElement Password;

public void setPassWord(String ps) {
driver.findElement(By.id("password")).sendKeys(ps);
}
public void ClickOnLogin() throws InterruptedException {
	driver.findElement(By.id("submit")).click();
	Thread.sleep(5000);
}
public void logout() throws InterruptedException {
	if(driver.getCurrentUrl().equals("https://practicetestautomation.com/logged-in-successfully/"))
	{
		System.out.println("Login was successful!!!");
		driver.findElement(By.partialLinkText("Log")).click();
	}
	else
	{
		System.out.println("Login was not successful!!");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());

	}
	
}

}
