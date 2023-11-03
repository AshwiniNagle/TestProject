package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D18HandlingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		WebElement fGender = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+fGender.isDisplayed());
		System.out.println("Enabled:"+fGender.isEnabled());
		System.out.println("Selected:"+fGender.isSelected());
		if(fGender.isSelected()==false)
			fGender.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+fGender.isDisplayed());
		System.out.println("Enabled:"+fGender.isEnabled());
		System.out.println("Selected:"+fGender.isSelected());
	}

}
