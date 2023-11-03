package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D15LocateByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.google.co.in");
				List<WebElement>links = driver.findElements(By.tagName("a"));
				System.out.println("Total links on page:"+links.size());
				/*for(int i=0;i<links.size();i++)
					System.out.println(links.get(i).getText());*/
				for(WebElement l: links)
					System.out.println(l.getText());
				driver.close();
					
	}

}
