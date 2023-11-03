package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class S01GoogleSearch {
	WebDriver driver;
	@Given("Open google application")
	public void open_google_application() {
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}

	@When("I enter Valid keyword in searchbox")
	public void i_enter_valid_keyword_in_searchbox() {
	    driver.findElement(By.name("q")).sendKeys("Cute dogs");
	}

	@When("Hit enter key")
	public void hit_enter_key() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Search result should display")
	public void search_result_should_display() {
	    System.out.println("Result Page Title:" +driver.getTitle());
	}

}
