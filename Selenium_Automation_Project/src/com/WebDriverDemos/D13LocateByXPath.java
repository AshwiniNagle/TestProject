package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D13LocateByXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("sapkalash@gmail.com");
	driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("test@123");
			driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();

	}

}
