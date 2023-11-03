package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.close();
	}

}
