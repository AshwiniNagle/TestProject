package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeAndAfterTest {
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
	 @Test(priority = 1)
	  public void openMyntra() {
		  
		  driver.get("https://www.myntra.com/");
		  System.out.println("Title:"+driver.getTitle());
		 
	  }
	 @Test(priority = 3)
	  public void openIstqb() {
		  
		  driver.get("https://www.istqb.in/");
		  System.out.println("Title:"+driver.getTitle());
		  
	  }
	 @Test(priority = 4)
	  public void openGoogle() {
		 
		  driver.get("https://www.google.com/");
		  System.out.println("Title:"+driver.getTitle());
		  
	  }
	 @Test(priority = 2)
	  public void openAmazon() {
		  
		  driver.get("https://www.amazon.in/");
		  System.out.println("Title:"+driver.getTitle());
		  
		  
	  }
	 
}
