package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D17HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		WebElement chkBox = driver.findElement(By.cssSelector("input[name^='chk']"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+chkBox.isDisplayed());
		System.out.println("Enabled:"+chkBox.isEnabled());
		System.out.println("Selected:"+chkBox.isSelected());
		if(chkBox.isSelected()==false)
			chkBox.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+chkBox.isDisplayed());
		System.out.println("Enabled:"+chkBox.isEnabled());
		System.out.println("Selected:"+chkBox.isSelected());
		
	}

}
