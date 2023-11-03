package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05AssignmentGoogle {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		 driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void beforeMethod() {
	
	driver.get("https://www.google.com/");
	System.out.println("Title:"+driver.getTitle());
	}
	@AfterMethod
	public void showTitle() {
		System.out.println("Title:"+driver.getTitle());
		
		
		}
	 @Test(priority = 1)
	  public void ClickOnGmail() {
		  
		  
		 driver.findElement(By.partialLinkText("mail")).click();
		 
	  }
	 @Test(priority = 2)
	  public void ClickOnImages() {
		  
		  
		 driver.findElement(By.partialLinkText("Images")).click();
		  
	  }
	 @Test(priority = 3)
	  public void ClickOnAbout() {
		 
		  
		 driver.findElement(By.partialLinkText("About")).click();  
		  
	  }
	 @Test(priority = 4)
	  public void ClickOnAdvt() {
		  
		 driver.findElement(By.partialLinkText("Adv")).click();
		 
		  
		  
	  }
}
