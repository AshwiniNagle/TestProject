package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class D31MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		driver.get("https://demoqa.com/buttons");
		WebElement dblClick = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		WebElement dClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));

		act.moveToElement(dblClick).doubleClick().perform();
		act.moveToElement(rightClick).contextClick().perform();
		act.moveToElement(dClick).click().perform();
		System.out.println( driver.findElement(By.id("doubleClickMessage")).getText());
		System.out.println( driver.findElement(By.id("rightClickMessage")).getText());
		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
		driver.close();
	}

}
