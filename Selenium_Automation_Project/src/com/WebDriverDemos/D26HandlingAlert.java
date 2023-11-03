package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D26HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.id("login1")).sendKeys("Ashwini");
		driver.findElement(By.name("proceed")).click();
		Alert alt = driver.switchTo().alert();    //Jump to alert
System.out.println(alt.getText());               
alt.accept();                                    //Click on Ok button/Hit Enter
driver.close();
	}

}
