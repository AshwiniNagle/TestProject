package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
			WebElement emailID	=driver.findElement(By.name("email"));
			emailID.sendKeys("sapkalash@gmail.com");
			WebElement password	=driver.findElement(By.name("pass"));
			password.sendKeys("test@123");
			WebElement loginBtn	=driver.findElement(By.name("login"));
			loginBtn.click();
				
	}

}
