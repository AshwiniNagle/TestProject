package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D09LocateByCssSelectorMultipleAtrribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.google.co.in");
				WebElement searchbox =driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"][autocomplete=\"off\"]"));
				searchbox.sendKeys("Funny Testing Quotes");
				searchbox.sendKeys(Keys.ENTER);

	}

}
