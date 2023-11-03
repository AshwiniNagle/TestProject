package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D14LocateByRelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//form[@class='_9vtf']/div/div/input")).sendKeys("sapkalash@gmail.com");
	driver.findElement(By.xpath("//form[@data-testid='royal_login_form']/div/div[2]/div/input")).sendKeys("test@123");
			driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

	
	}

}
