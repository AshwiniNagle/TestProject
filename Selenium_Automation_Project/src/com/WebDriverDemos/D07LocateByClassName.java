package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D07LocateByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.google.co.in");
				WebElement searchbox =driver.findElement(By.className("gLFyf"));
				searchbox.sendKeys("Ms Dhoni");
				searchbox.sendKeys(Keys.ENTER);
	}

}
