package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D09POMClient {
	WebDriver driver;
	PracticeTestLogin p1;
	Keyword k1 = new Keyword();
  @Test
  public void login1() throws InterruptedException {
	  p1.setUserName("student");
	  p1.setPassWord("Password123");
	  p1.ClickOnLogin();
	  p1.logout();
  }
  @Test
  public void login2() throws InterruptedException {
	  p1.setUserName("smeera");
	  p1.setPassWord("Password123");
	  p1.ClickOnLogin();
	  p1.logout();
  }  
  @Test
  public void login3() {
	  k1.setText("smeera", p1.Username);
	  k1.setText("pass123",p1.Password );
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	   p1 = new PracticeTestLogin(driver);
	   
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
