package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D02ShowTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.selenium.dev/downloads/");
				String title = driver.getTitle();
				System.out.println("Title:"+title);
				if(title.contains("Selenium"))
					System.out.println("Title match:Test Case Pass"); 
				else
					System.out.println("Title not matching:Test Case Fail");
			
		
				driver.close();

	}

}
