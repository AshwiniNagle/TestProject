package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A06EchoTrakLoginByRelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		driver.findElement(By.xpath("//form[@name='Form2']/fieldset/div[2]/fieldset/input[1]")).sendKeys("sapkalash@gmail.com");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@name=\"Butsub\"]")).click();

		

	}

}
