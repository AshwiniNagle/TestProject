package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20HandlingListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement lstBox = driver.findElement(By.name("selenium_commands"));
      Select commands = new Select(lstBox);
      commands.selectByIndex(1);
      commands.selectByIndex(3);
List<WebElement>selectedCommands = commands.getAllSelectedOptions();
for(WebElement c :selectedCommands)
	System.out.println(c.getText());
	}

}
