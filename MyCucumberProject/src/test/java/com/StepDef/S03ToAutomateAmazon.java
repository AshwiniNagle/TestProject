package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class S03ToAutomateAmazon {
	String title;
	WebDriver driver;
	private String link;
	@Given("Open {string}")
	public void open(String string) {
		driver = new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.amazon.in/");
	    
	}

	@When("Read home page title")
	public void read_home_page_title() {
		title = driver.getTitle();
	}

	@Then("Display the title")
	public void display_the_title() {
		System.out.println("Title: " + title);
	}

	@When("Enter text in searchbox")
	public void enter_text_in_searchbox() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	    
	}

	@When("Click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	    
	}

	@Then("user should get the result")
	public void user_should_get_the_result() {
		System.out.println("Search result display ");
	}

	@When("Enter the text in  the searchbox")
	public void enter_the_text_in_the_searchbox() {
		driver.get("https://www.amazon.in/Apple-iPhone-14-128GB-Blue/dp/B0BDK62PDX/ref=sr_1_1_sspa?crid=MVDMCSF6NB7C&keywords=iphone&qid=1696408368&sprefix=iphone%2Caps%2C358&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
	    
	}

	@When("Click on search btn")
	public void click_on_search_btn() {
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	}

	@Then("Item should get Added")
	public void item_should_get_added() {
		System.out.println("Item Added!! ");
	   
	}

	@When("I Click on {string} link")
	public void i_click_on_link(String link) {
		driver.findElement(By.partialLinkText(link)).click();
	}

	@Then("Read and display the title")
	public void read_and_display_the_title() {
		System.out.println("Title: " + driver.getTitle());
	}

	@When("I Click {string} link")
	public void i_click_link(String link) {
		driver.findElement(By.partialLinkText(link)).click();
	}

	@Then("Read and display title")
	public void read_and_display_title() {
		System.out.println("Title: " + driver.getTitle());
	    
	}

	@When("User Click on {string} link")
	public void user_click_on_link(String link) {
		driver.findElement(By.partialLinkText(link)).click();
	}

	@Then("Read and display the title of Todays deal")
	public void read_and_display_the_title_of_todays_deal() {
		System.out.println("Title: " + driver.getTitle());
	    
	}

	@When("Click on {string} link")
	public void click_on_link(String link) {
	
		driver.findElement(By.partialLinkText(link)).click();
	   
	}

	@Then("Read and display the title of mobile page")
	public void read_and_display_the_title_of_mobile_page() {
		System.out.println("Title: " + driver.getTitle());
	    
	}

}
