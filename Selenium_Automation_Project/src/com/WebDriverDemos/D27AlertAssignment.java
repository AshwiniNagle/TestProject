package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D27AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		Alert alt;
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
		
		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
	}

}
