package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A02ShowErrorMsgByNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
	     WebElement username = driver.findElement(By.name("txtCustomerID"));
		 username.sendKeys("sapkalash@gmail.com");
		 WebElement password=driver.findElement(By.name("txtPassword"));
		 password.sendKeys("test@123");
		 WebElement loginBtn = driver.findElement(By.name("Butsub"));
		 loginBtn.click();
		 WebElement message	= driver.findElement(By.className("error"));
         System.out.println(message.getText());
	}

}
