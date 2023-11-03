package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A03ShowErrorMsgBySingleAttributeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
	     WebElement username = driver.findElement(By.cssSelector("input[type=\"text\"]"));
		 username.sendKeys("sapkalash@gmail.com");
		 WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		 password.sendKeys("test@123");
		 WebElement loginBtn = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		 loginBtn.click();
		 WebElement message	= driver.findElement(By.className("error"));
         System.out.println(message.getText());
	}

}
