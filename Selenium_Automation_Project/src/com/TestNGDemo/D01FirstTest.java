package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
  @Test
  public void openMyntra() {
	  WebDriver driver =new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.myntra.com/");
	  System.out.println("Title:"+driver.getTitle());
	  driver.quit();
  }
}
