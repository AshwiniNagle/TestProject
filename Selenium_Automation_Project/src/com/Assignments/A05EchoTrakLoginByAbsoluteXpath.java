package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A05EchoTrakLoginByAbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input")).sendKeys("sapkalash@gmail.com");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input[2]")).sendKeys("test@123");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[3]/div/input")).click();

				
	}

}
                                     