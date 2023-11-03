package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
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
	System.out.println("Before Method");
	}
	@AfterMethod
	public void showTitle() {
		System.out.println("Title:"+driver.getTitle());
		System.out.println("After Method");
		}
	 @Test(priority = 1)
	  public void openMyntra() {
		  
		  driver.get("https://www.myntra.com/");
		  
		 
	  }
	 @Test(priority = 3)
	  public void openIstqb() {
		  
		  driver.get("https://www.istqb.in/");
		  
		  
	  }
	 @Test(priority = 4)
	  public void openGoogle() {
		 
		  driver.get("https://www.google.com/");
		  
		  
	  }
	 @Test(priority = 2)
	  public void openAmazon() {
		  
		  driver.get("https://www.amazon.in/");
		 
		  
		  
	  }
}
