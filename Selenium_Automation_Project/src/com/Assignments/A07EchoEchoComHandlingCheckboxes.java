package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A07EchoEchoComHandlingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/");
		driver.findElement(By.partialLinkText("Tutorials")).click();
		driver.findElement(By.partialLinkText("HTML")).click();
		driver.findElement(By.partialLinkText("HTML FORMS")).click();
		driver.findElement(By.partialLinkText("CHECK BOX")).click();
		
	WebElement MilkChkBox = driver.findElement(By.cssSelector("input[name='option1']"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+MilkChkBox.isDisplayed());
		System.out.println("Enabled:"+MilkChkBox.isEnabled());
		System.out.println("Selected:"+MilkChkBox.isSelected());
		if(MilkChkBox.isSelected()==false)
			MilkChkBox.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+MilkChkBox.isDisplayed());
		System.out.println("Enabled:"+MilkChkBox.isEnabled());
		System.out.println("Selected:"+MilkChkBox.isSelected()); 
		
	
		
		WebElement CheeseChkBox = driver.findElement(By.cssSelector("input[name='option3']"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+CheeseChkBox.isDisplayed());
		System.out.println("Enabled:"+CheeseChkBox.isEnabled());
		System.out.println("Selected:"+CheeseChkBox.isSelected());
		if(CheeseChkBox.isSelected()==false)
			CheeseChkBox.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+CheeseChkBox.isDisplayed());
		System.out.println("Enabled:"+CheeseChkBox.isEnabled());
		System.out.println("Selected:"+CheeseChkBox.isSelected());
	
	}

}
