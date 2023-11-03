package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingDropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Acco")).click();
		WebElement drplist = driver.findElement(By.id("country"));
		Select countries = new Select(drplist);
System.out.println("Selected Country:"+ countries.getFirstSelectedOption().getText());
List<WebElement>countryList = countries.getOptions();
System.out.println("Total Countries:"+ countryList.size());
/* int i=0;
 for(WebElement c: countryList)
  {
  System.out.println(i+"."+c.getText());
  i++;
 

	}*/
//countries.selectByVisibleText("Oman");
//countries.selectByValue("160");
countries.selectByIndex(157);
System.out.println("Selected Country:"+ countries.getFirstSelectedOption().getText());

	}

}
