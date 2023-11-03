package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D10LocateBySpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				//$-Ends with
				WebElement mailId = driver.findElement(By.cssSelector("input[placeholder$='number']"));
                mailId.sendKeys("sapkalash@gmail.com");
                //*-contains
                WebElement password = driver.findElement(By.cssSelector("input[data-testid*='yal_p']"));
                password.sendKeys("test@123");
                //^-starts with
                WebElement loginBtn = driver.findElement(By.cssSelector("button[id^='u_0_5']"));
                loginBtn.click();
	}

}
