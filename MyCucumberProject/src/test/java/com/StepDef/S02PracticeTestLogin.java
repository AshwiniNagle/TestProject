package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class S02PracticeTestLogin {
WebDriver driver;
@Given("Open practice test page")
public void open_practice_test_page() {
   driver = new EdgeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://practicetestautomation.com/practice-test-login/");
   
}

@When("Enter valid username")
public void enter_valid_username() {
    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
}

@When("Enter valid password")
public void enter_valid_password() {
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
}

@When("Click on login button")
public void click_on_login_button() {
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
}

@Then("user should login")
public void user_should_login() {
	if(driver.getCurrentUrl().contains("successfully"))
		System.out.println("Login successful");
	else
		System.out.println("Login not successful");
}
@Given("Open practice test page in browser")
public void open_practice_test_page_in_browser() {
	driver = new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://practicetestautomation.com/practice-test-login/");
}

@When("Enter invalid username")
public void enter_invalid_username() {
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("smeera");
}

@When("Enter invalid password")
public void enter_invalid_password() {
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pword123");
}

@When("Click on login btn")
public void click_on_login_btn() {
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
}

@Then("error message should display")
public void error_message_should_display() {
	System.out.println(driver.findElement(By.id("error")).getText());
}

}
