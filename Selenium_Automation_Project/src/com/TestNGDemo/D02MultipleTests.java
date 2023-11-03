package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
	 @Test(priority = 1)
	  public void openMyntra() {
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.myntra.com/");
		  System.out.println("Title:"+driver.getTitle());
		  driver.quit();
	  }
	 @Test(priority = 3)
	  public void openRediff() {
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.rediff.com/");
		  System.out.println("Title:"+driver.getTitle());
		  driver.quit();
	  }
	 @Test(priority = 4)
	  public void openGoogle() {
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.google.com/");
		  System.out.println("Title:"+driver.getTitle());
		  driver.quit();
	  }
	 @Test(priority = 2)
	  public void openAmazon() {
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.amazon.in/");
		  System.out.println("Title:"+driver.getTitle());
		  driver.quit();
	  }
}
