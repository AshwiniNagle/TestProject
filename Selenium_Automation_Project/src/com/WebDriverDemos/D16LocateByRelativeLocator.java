package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D16LocateByRelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("pass"))).sendKeys("sapkalash@gmail.com");
				driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("login")).below(By.name("email"))).sendKeys("test@123");
				driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.name("pass"))).click();
				
	}

}
